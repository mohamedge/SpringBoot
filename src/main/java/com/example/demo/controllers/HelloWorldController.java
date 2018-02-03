package com.example.demo.controllers;

import java.util.HashSet;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Player;
import com.example.demo.domain.Team;
import com.example.demo.repositories.TeamDAO;

@RestController
public class HelloWorldController {
	
	@Autowired
	private TeamDAO teamDao;
	
	

	@GetMapping(path="/hi/{name}")
	public  String  SayHello(Map model, @PathVariable String name) {
		model.put("name", name);
		return "hello";
	}
	
	
	@GetMapping(path="/team/{name}")
	public Team GetTeam(@PathVariable String name ){
		Team t =  teamDao.findByName(name);
		return t;
	}
}
