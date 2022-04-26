package com.steve.startup.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.steve.startup.models.Idea;

@Repository
public interface IdeaRepository extends CrudRepository<Idea, Long> {
	
}
