package com.jiwon.project.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jiwon.project.dao.ClassDao;
import com.jiwon.project.dao.NumberDao;
import com.jiwon.project.dto.NumberDto;
import com.jiwon.project.service.ClassService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
	@PostMapping(value="/getStt")
    public String getStt(@RequestBody NumberDto numberDto) throws Exception {
        String result = "";
        int num = numberDto.getNumber();

        System.out.println(Integer.toString(num));
        
        Process process = Runtime.getRuntime().exec("python C://Users//jeonjiwon//Desktop//capstone_jiwon//stt//mp3ToWav.py " + num);

        BufferedReader stb = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader ste = new BufferedReader(new InputStreamReader(process.getErrorStream()));


        while ((stb.readLine()) != null) {
            System.out.println("11111111111 :::::::::::: " + stb.readLine());
            result = "success";
        }
        while ((ste.readLine()) != null) {
            System.out.println("22222222222 :::::::::::: " + stb.readLine());
            result = "fail";
        }
        return result;
    }

    @GetMapping(value="/textFileUpload")
    public String textFileUpload() throws Exception {

        return null;
    }
}