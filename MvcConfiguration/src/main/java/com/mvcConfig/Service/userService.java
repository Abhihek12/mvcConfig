package com.mvcConfig.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvcConfig.Modal.User;
import com.mvcConfig.Repository.userRepo;

@Service
public class userService {
	@Autowired
	private userRepo repo;
	
	public String createUser(User user) {
		 repo.save(user);		
		 return "Success";
	}

}
