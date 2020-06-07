package com.jiwon.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jiwon.project.dto.UserDto;
import com.jiwon.project.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	// @GetMapping(value="/getMapping")
    // public String login(@RequestParam String userId, @RequestParam String userPw) throws Exception {
	// 	System.out.println("login method!!!!!!!!!!!!@@@@@@@@@@@@!!!!!!!!!!!");

	// 	System.out.println("userID ::::::::::::: " + userId);
	// 	System.out.println("userPw ::::::::::::: " + userPw);

	// 	return "success";
	// }

	@GetMapping(value="/getMapping")
    public String test(@RequestParam String userId, @RequestParam String userPw) throws Exception {
		
		System.out.println("userID ::::::::::::: " + userId);
		System.out.println("userPw ::::::::::::: " + userPw);

		String userdata = userService.selectUserCheck(userId, userPw);

		System.out.println("database ::: id check :::: " + userdata);

		return "success";
	}

	@GetMapping(value="/getMapping")
    public Map<String, Object> userLoginCheck(@RequestParam String userId, @RequestParam String userPw) throws Exception {
		
		Map<String, Object> returnValue = new HashMap<String, Object>();

		System.out.println("userID ::::::::::::: " + userId);
		System.out.println("userPw ::::::::::::: " + userPw);

		List<UserDto> userInfo = userService.selectLoginCheck();

		System.out.println("database ::: User Info check :::: " + userInfo);

		return returnValue;
	}
}


