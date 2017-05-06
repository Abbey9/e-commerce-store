package com.myapps.ecommercestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String welcomePage(){
	  
	  return "welcome";
	}
	
	@RequestMapping("/home")
	public String welcomeLandingPage(){
	  
	  return "welcome";
	}
	
	@RequestMapping("/login")
	public String loginPage(){
	  
	  return "login";
	}
	
	@RequestMapping("/signUp")
	public String signUpPage(){
	  
	  return "signUp";
	}



}
