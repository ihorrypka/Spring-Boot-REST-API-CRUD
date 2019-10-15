package com.boxingcorporation.springboot.crudrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boxingcorporation.springboot.crudrest.entity.Boxer;

public interface BoxerRepository extends JpaRepository<Boxer, Integer> {
	
	// that's it ... no need to write any code LOL!

}
