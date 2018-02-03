package com.example.demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Team {

	@Id
	@GeneratedValue
	Long id;
	String name;
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(name="teamId")
	Set<Player> players;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
	public Team() {
		super();
	}
	public Team(String name, Set<Player> players) {
		this();
		this.name = name;
		this.players = players;
	}
	
	
}
