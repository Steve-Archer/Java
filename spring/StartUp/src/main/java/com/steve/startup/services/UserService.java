package com.steve.startup.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.steve.startup.models.LoginUser;
import com.steve.startup.models.User;
import com.steve.startup.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	public User register(User newUser, BindingResult result) {
		
		Optional<User> registerAttempt = userRepo.findByEmail(newUser.getEmail());
		if(registerAttempt.isPresent()) {
			result.rejectValue("email", "EmailTaken", "This email is already taken.");
		}
		if (!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm", "PasswordMismatch", "Confirmed password doesn't match.");
		}
		if(result.hasErrors()) {
			return null;
		}else {
			String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			newUser.setPassword(hashed);
			return this.userRepo.save(newUser);
		}
		
	}
	public User login(LoginUser newLoginObject, BindingResult result) {
		Optional<User> loginAttempt = this.userRepo.findByEmail(newLoginObject.getEmail());
		if(!loginAttempt.isPresent()) {
			result.rejectValue("email", "notFound", "Unknown Email");
		}else {
			if(!BCrypt.checkpw(newLoginObject.getPassword(), loginAttempt.get().getPassword())) {
				result.rejectValue("password", "InvalidPassword","Invalid Password");
			}
		}
		if(result.hasErrors()) {
			return null;
		}else {
			return loginAttempt.get();
		}
	}
	public User findOneUser(Long id) {
		return this.userRepo.findById(id).orElse(null);
	}
}



