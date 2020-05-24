package com.jiwon.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    
    @RequestMapping("/login")
    @ResponseBody
    public String index() {

        System.out.println("hello!!");

        return "Hello, Spring";
    }
}

