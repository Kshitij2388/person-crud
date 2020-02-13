package com.ksh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ksh.entities.Person;
import com.ksh.reqrep.CommonResponse;
import com.ksh.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping("/findAll")
	public CommonResponse findAll() {
		List<Person> persons = personService.findAll(); 
		
		CommonResponse cr = new CommonResponse(200, "Data Found", persons);
		return cr;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public CommonResponse findAll(@RequestBody Person person) {
		
		List<Person> persons = personService.findAll(); 
		CommonResponse cr = new CommonResponse(200, "Data Found", persons);
		return cr;
	}
	
}
