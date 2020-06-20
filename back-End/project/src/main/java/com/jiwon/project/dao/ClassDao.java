package com.jiwon.project.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ClassDao {
    
    List<Map<String, Object>> selectClassInfo();
}

