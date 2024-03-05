package com.kodnest.tunehub.service;

import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestParam;

import com.kodnest.tunehub.entity.User;

public interface UserService 
{
	public String addUser(@ModelAttribute User user);
	public boolean emailExists(String email);	
	public boolean validateUser(String email, String password);
	public String getRole(String email);
	public User getUser(String email);
	public void updateUser(User user);
}
