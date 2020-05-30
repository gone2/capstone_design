package com.jiwon.project.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

//환경 설정을 하기위한 파일
@Configuration
//com.jiwon.test.dao 는 DB를 다룰 Mapper
@MapperScan(value = {"com.jiwon.project.dao"})
public class DataSourceConfig {
    
    //javax.sql.DataSource     
    // DataSource =>    SqlSessionFactory 
    //   => SqlSessionTemplate => SqlSession
    //<bean>태그에 대응되는 코드 설정
    //스프링 레거시프로젝트에서는 xml에 작성했던 코드를 스프링부트에서는 이쪽에 코드로 작성한 것이다.
    //sqlSessionFactory가 sqlsessionTemplate를 만들고, sqlsessionTemplate가 sqlsession을 만든다.
    @Bean //자바코드로 bean을 등록
    public SqlSessionFactory sqlSessionFactory( DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();

        bean.setDataSource(dataSource); //데이터소스 설정
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:static/mappers/*.xml"));
        
        return bean.getObject();
    }
    
    @Bean
    public SqlSessionTemplate sqlSession(SqlSessionFactory factory) {
        return new SqlSessionTemplate(factory);
    }
}