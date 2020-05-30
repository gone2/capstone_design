package com.jiwon.project.dao;
    
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private SqlSessionTemplate sqlsessionTemplate;

    public Map<String, Object> getUserInfo(String userId) {
        return sqlsessionTemplate.selectOne("userMapper.getUserInfo", userId);
    }
}