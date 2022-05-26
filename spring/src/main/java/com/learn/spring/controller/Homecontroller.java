package com.learn.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learn.spring.dto.Signup;
import com.learn.spring.service.Signupservice;

@Controller
public class Homecontroller {
	
	@Autowired
	Signupservice ss;
	
	@RequestMapping("/")
	public String Welcome()
	{
		return "signup";
	}
	
	@RequestMapping("/adduser")
	public String adduser(Signup signup)
	{
        Signup user= ss.addsignup(signup);
		return "signup";
	}
	

}
