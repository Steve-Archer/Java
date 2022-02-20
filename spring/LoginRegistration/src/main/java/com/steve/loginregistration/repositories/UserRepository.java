package com.steve.loginregistration.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.steve.loginregistration.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	Optional<User> findByEmail(String email);
}
