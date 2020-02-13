package com.ksh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ksh.entities.Hobby;
import com.ksh.services.HobbyService;

@RestController
@RequestMapping("/hobby")
public class HobbyController {

	@Autowired
	private HobbyService hobbyService;
	
	@RequestMapping("/findAll")
	private List<Hobby> findAll() {
		return hobbyService.findAll();
	}
}
