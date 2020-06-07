package com.jiwon.project.dao;

import java.util.List;

import com.jiwon.project.dto.UserDto;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {

    String selectUserCheck(String userId, String userPw);

    List<UserDto> selectLoginCheck();
}