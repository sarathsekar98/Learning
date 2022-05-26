package com.learn.spring.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learn.spring.dto.Signup;

@Repository
public class Signupimp {
	
	@Autowired
	JdbcTemplate jdbctemplate;

	public int adduser(Signup signup) {
		// TODO Auto-generated method stub
		
		String query = "insert into signup(email,password)values(?,?)"; 
		int result = jdbctemplate.update(query,signup.getEmail(),signup.getPassword());
	
		return result;
	}

	
}
