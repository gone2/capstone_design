package com.jiwon.project.service;

import java.util.List;

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

    public String selectUserCheck(String userId, String userPw) {
        return userDao.selectUserCheck(userId, userPw);
    }

    public List<UserDto> selectLoginCheck() {
        return userDao.selectLoginCheck();
    }
}