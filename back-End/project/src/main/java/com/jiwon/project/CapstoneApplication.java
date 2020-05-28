package com.jiwon.project;
 
import javax.sql.DataSource;
 
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//현재 클래스를 스프링 부트 애플리케이션의 시작 클래스로 등록함
//main 메소드가 있기 때문에 시작 클래스로 등록하여야 한다.
@SpringBootApplication

//sql mapper의 위치를 지정 (model 하위에 mapper이 들어간다는 뜻)
@MapperScan("com.jiwon.project.model")
public class CapstoneApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(CapstoneApplication.class, args);
    }
    
    //javax.sql.DataSource     
    // DataSource =>    SqlSessionFactory 
    //   => SqlSessionTemplate => SqlSession
    //<bean>태그에 대응되는 코드 설정
    //스프링 레거시프로젝트에서는 xml에 작성했던 코드를 스프링부트에서는 이쪽에 코드로 작성한 것이다.
    //sqlSessionFactory가 sqlsessionTemplate를 만들고, sqlsessionTemplate가 sqlsession을 만든다.
    @Bean //자바코드로 bean을 등록
    public SqlSessionFactory sqlSessionFactory(
            DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
        bean.setDataSource(dataSource); //데이터소스 설정
        return bean.getObject();
    }
    
    @Bean
    public SqlSessionTemplate sqlSession(
            SqlSessionFactory factory) {
        return new SqlSessionTemplate(factory);
    }
}