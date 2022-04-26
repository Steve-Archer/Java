package com.steve.startup.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steve.startup.models.Idea;
import com.steve.startup.repositories.IdeaRepository;

@Service
public class IdeaService {
	
	@Autowired
	private IdeaRepository ideaRepo;
	
	public List<Idea> findAllIdeas(){
		return (List<Idea>)this.ideaRepo.findAll();
	}
	public Idea createIdea(Idea idea) {
		return this.ideaRepo.save(idea);
	}
	public Idea getIdeaDetail(Long id) {
		return this.ideaRepo.findById(id).orElse(null);
	}
	public Idea editIdea(Idea idea) {
		return this.ideaRepo.save(idea);
	}
	public void deleteIdea(Long id) {
		this.ideaRepo.deleteById(id);
	}
}
