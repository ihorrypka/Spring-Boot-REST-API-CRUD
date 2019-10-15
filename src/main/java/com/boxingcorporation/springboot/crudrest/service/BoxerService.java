package com.boxingcorporation.springboot.crudrest.service;

import java.util.List;

import com.boxingcorporation.springboot.crudrest.entity.Boxer;

public interface BoxerService {
	
	public List<Boxer> findAll();
	
	public Boxer findById(int theId);
	
	public void save(Boxer theBoxer);
	
	public void deleteById(int theId);

}
