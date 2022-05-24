package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.Dao.Signup;

@Controller
public class Homecontroller {
	
	@Autowired
	JdbcTemplate jdbc1;
	
	
	@RequestMapping("/")
	public String welcome()
	{
		return "welcome";
	}
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	@RequestMapping("/signup")
	public String signup(@ModelAttribute(name="signup") Signup signup)
	{
		
		if(signup.getEmail()!=null && signup.getPassword()!=null)
			{
			int result = jdbc1.update("insert into signup(email,password)values(?,?);",signup.getEmail(),signup.getPassword());
			System.out.println(result);
			}
		return "signup";
		
		
	}

}
