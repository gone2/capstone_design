package com.jiwon.project.controller;

import java.util.Map;

import com.jiwon.project.dto.UserDto;
import com.jiwon.project.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

	// @GetMapping(value="/getMapping")
    // public String test(@RequestParam String userId, @RequestParam String userPw) throws Exception {
		
	// 	System.out.println("userID ::::::::::::: " + userId);
	// 	System.out.println("userPw ::::::::::::: " + userPw);

	// 	HashMap<String, Object> user = new HashMap<String, Object>();

	// 	user.put("userId", userId);

	// 	String userdata = userService.selectUserCheck(userId, userPw);

	// 	System.out.println("database ::: id check :::: " + userdata);

	// 	return "success";
	// }

	@PostMapping(value="/postMapping")
    public String userLoginCheck(@RequestBody UserDto user) throws Exception {

		String returnValue;
		Map<String, Object> userInfo = userService.selectLoginCheck(user);

		if(user.getUserId().equals(userInfo.get("USER_ID"))) {
			returnValue = "sucess";
		} else {
			returnValue = "fail";
		}
		return returnValue;
	}
}


