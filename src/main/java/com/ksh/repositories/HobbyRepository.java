package com.ksh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksh.entities.Hobby;

@Repository
public interface HobbyRepository extends JpaRepository<Hobby, Integer> {

}
