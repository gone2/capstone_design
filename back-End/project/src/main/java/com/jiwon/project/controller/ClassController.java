package com.jiwon.project.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jiwon.project.dto.ClassDto;
import com.jiwon.project.service.ClassService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassController {
    
	@Autowired
    ClassService classService;
    
	@PostMapping(value="/myClassInfo")
    public Map<String, Object> classInformation() throws Exception {
        Map<String, Object> classInfoReturn = new HashMap<String, Object>();

        List<Map<String, Object>> classInfo = classService.selectClassInfo();

        classInfoReturn.put("classData", classInfo);
        return classInfoReturn;
    }
    
	@GetMapping(value="/getStt")
    public static void getStt() throws Exception {
        ProcessBuilder pb = new ProcessBuilder();
        Process process = Runtime.getRuntime().exec("python C://Users//jeonjiwon//Desktop//capstone_jiwon//stt//mp3ToWav.py");

        // pb.command("cmd.exe", "/c", "dir C://Users//jeonjiwon//Desktop//capstone_jiwon//stt//test.py");

        // Process process = pb.start();

        String s = null;

        BufferedReader stb = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader ste = new BufferedReader(new InputStreamReader(process.getErrorStream()));

        while ((s = stb.readLine()) != null) {
            System.out.println(s);
        }
        while ((s = ste.readLine()) != null) {
            System.out.println(s);
        }
    }
}