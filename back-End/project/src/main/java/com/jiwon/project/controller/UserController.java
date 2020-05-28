package com.jiwon.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    
	@RequestMapping(value="/")
    @ResponseBody
    public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Home...");
		mav.setViewName("login");
		return mav;
    }
}

