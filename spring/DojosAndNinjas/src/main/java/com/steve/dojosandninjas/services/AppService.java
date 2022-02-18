package com.steve.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.steve.dojosandninjas.models.Dojo;
import com.steve.dojosandninjas.models.Ninja;
import com.steve.dojosandninjas.repositories.DojoRepository;
import com.steve.dojosandninjas.repositories.NinjaRepository;


@Service
public class AppService {
	private final NinjaRepository ninjaRepo;
	private final DojoRepository dojoRepo;
	
	public AppService(NinjaRepository ninjaRepo, DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}
	public Dojo newDojo(Dojo dojo) {
		return this.dojoRepo.save(dojo);
	}
	public Ninja newNinja(Ninja ninja) {
		return this.ninjaRepo.save(ninja);
	}
	public List<Dojo> getAllDojos(){
		return (List<Dojo>)this.dojoRepo.findAll();
	}
	public Dojo getDojo(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
	
	
	
}
