package com.jiwon.project.controller;

import com.jiwon.project.dto.UserDto;

// import com.jiwon.project.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping(value="/getMapping")
    public String login(@RequestParam String userId, @RequestParam String userPw) {
		System.out.println("login method!!!!!!!!!!!!@@@@@@@@@@@@!!!!!!!!!!!");

		System.out.println("userID ::::::::::::: " + userId);
		System.out.println("userPw ::::::::::::: " + userPw);

		return "success";
	}

	// @PostMapping
}


