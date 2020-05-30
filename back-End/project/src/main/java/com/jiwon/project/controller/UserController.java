package com.jiwon.project.controller;

import com.jiwon.project.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
    @Autowired
    private UserService userService;
    
	@GetMapping(value="/jiwon/login")
    public String login() {
		System.out.println("login method!!!!!!!!!!!!@@@@@@@@@@@@!!!!!!!!!!!");
		return "index.html";
	}
}


