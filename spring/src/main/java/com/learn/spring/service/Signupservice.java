package com.learn.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.spring.dto.Signup;
import com.learn.spring.respository.Signupimp;

@Service
public class Signupservice {
	
	@Autowired
	Signupimp simp;

	public Signup addsignup(Signup signup) {
		// TODO Auto-generated method stub
		simp.adduser(signup);
		return signup;
		
	}
}
