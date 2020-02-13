package com.ksh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksh.entities.Hobby;
import com.ksh.repositories.HobbyRepository;

@Service
public class HobbyService {

	@Autowired
	private HobbyRepository hobbyRepository;
	
	public List<Hobby> findAll() {
		return hobbyRepository.findAll();
	}
}
