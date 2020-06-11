package com.jiwon.project.dao;

import java.util.Map;

import com.jiwon.project.dto.UserDto;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {

    String selectUserCheck(String userId, String userPw);

    Map<String, Object> selectLoginCheck(UserDto user);
}