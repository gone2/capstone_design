package com.jiwon.project.service;

import java.util.List;
import java.util.Map;

import com.jiwon.project.dao.ClassDao;
import com.jiwon.project.dto.ClassDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClassService {

    @Autowired
    private ClassDao classDao;
    
    public List<Map<String, Object>> selectClassInfo() {
        return classDao.selectClassInfo();
    }
}