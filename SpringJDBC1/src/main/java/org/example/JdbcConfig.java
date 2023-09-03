package org.example;

import org.example.dao.StudentDao;
import org.example.dao.StudentImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"org.example.dao"})
public class JdbcConfig {
    @Bean("ds")
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("Password");
        return ds;
    }

    @Bean("jdbctemplet")
    public JdbcTemplate getTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

//    @Bean("studentDao")
//    public StudentDao getStudentDao(){
//        StudentImplement studentImplement = new StudentImplement();
//        studentImplement.setJdbcTemplate(getTemplate());
//        return studentImplement;
//    }
//commented coz using this by autowiring


}
