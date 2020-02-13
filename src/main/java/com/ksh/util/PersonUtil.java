package com.ksh.util;

import java.util.ArrayList;
import java.util.List;

import com.ksh.dtos.PersonDto;
import com.ksh.entities.Person;

public class PersonUtil {

	public static PersonDto entityToDto(Person person) {
		PersonDto dto = new PersonDto();
		dto.setAge(person.getAge());
		dto.setFavourite_color(person.getFavouriteColor());
		dto.setFirst_name(person.getFirstName());
		dto.setId(person.getId());
		dto.setLast_name(person.getLastName());
		return dto;
	}
	
	public static List<PersonDto> entityToDto(List<Person> persons) {
		List<PersonDto> dtos = new ArrayList<>();
		persons.forEach(person -> {
			PersonDto dto = new PersonDto();
			dto.setAge(person.getAge());
			dto.setFavourite_color(person.getFavouriteColor());
			dto.setFirst_name(person.getFirstName());
			dto.setId(person.getId());
			dto.setLast_name(person.getLastName());
			dtos.add(dto);
		});
		return dtos;
	}
	
	
}
