package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.domain.Player;
import com.example.demo.domain.Team;

@RestResource(path="players", rel="players")
public interface PlayerDAO  extends CrudRepository<Player, Long>{

}
