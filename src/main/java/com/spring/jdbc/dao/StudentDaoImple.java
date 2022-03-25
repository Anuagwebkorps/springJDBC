package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Student;

public class StudentDaoImple implements StudentDao {
  private JdbcTemplate jdbcTemplate;
	public int insert(Student stu) {
		String qr="insert into student values(?,?)";
		int i=this.jdbcTemplate.update(qr,stu.getId(),stu.getName());
		System.out.println("StudentDaoImple class runnning");
		System.out.println(i+" Update");

		return i  ;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
  
	

}
