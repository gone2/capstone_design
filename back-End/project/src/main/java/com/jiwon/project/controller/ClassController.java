package com.jiwon.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jiwon.project.dto.ClassDto;
import com.jiwon.project.service.ClassService;

import org.springframework.beans.factory.annotation.Autowired;
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
}