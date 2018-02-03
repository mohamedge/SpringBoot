package com.example.demo;

import java.util.HashSet;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.example.demo.domain.Player;
import com.example.demo.domain.Team;
import com.example.demo.repositories.TeamDAO;

@SpringBootApplication
public class MicroservicesBootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootApplication.class, args);
	}

	@Override
	// This will build a WAR rather than a JAR
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(MicroservicesBootApplication.class);
	}
	
	
	@PostConstruct
	public void init() {
		Team team = new Team();
		team.setName("mets");
		HashSet<Player>  players = new HashSet<>();
		players.add(new Player("James Smith", "catcher"));
		players.add(new Player("Joe S", "pitcher"));
		team.setPlayers(players);
		teamDao.save(team);
	}
	
	@Autowired
	TeamDAO teamDao;
}
