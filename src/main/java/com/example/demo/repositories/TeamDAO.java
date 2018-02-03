package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Team;

public interface TeamDAO  extends CrudRepository<Team, Long>{
	
	List<Team> findAll();
	Team findByName(String name);

}
