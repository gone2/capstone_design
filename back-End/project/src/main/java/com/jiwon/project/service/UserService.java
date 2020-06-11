package com.jiwon.project.service;

import java.util.Map;

import com.jiwon.project.dao.UserDao;
import com.jiwon.project.dto.UserDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    
    @Autowired
    private UserDao userDao;

    public Map<String, Object> selectLoginCheck(UserDto user) {
        return userDao.selectLoginCheck(user);
    }
}