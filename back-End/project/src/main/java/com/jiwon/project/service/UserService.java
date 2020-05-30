package com.jiwon.project.service;

import java.util.Map;

import com.jiwon.project.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserDao userDao;

    public Map<String, Object> getUserInfo(String userId) {
        return userDao.getUserInfo(userId);
    }
}