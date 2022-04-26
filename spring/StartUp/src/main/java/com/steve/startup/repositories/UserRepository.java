package com.steve.startup.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.steve.startup.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	Optional<User> findByEmail(String email);
}
