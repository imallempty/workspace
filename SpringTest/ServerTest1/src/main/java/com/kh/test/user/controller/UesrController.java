package com.kh.test.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.test.user.model.dto.User;
import com.kh.test.user.model.service.UserService;

import org.springframework.ui.Model;

@Controller
@RequestMapping("user")
public class UesrController {

	@Autowired
	private UserService service;

	@GetMapping("index")
	public String userIndex() {
		return "user/index";
	}

	
	@PostMapping("searchUser")
	public String searchUser(String inputId, Model model) {
		
		User searchUser = service.searchUser(inputId);
		
		if(searchUser != null) {
			model.addAttribute("searchUser", searchUser);
			return "user/searchSuccess";
		}
		
		return "user/searchFail";
	}
	 
}
