package com.boxingcorporation.springboot.crudrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boxingcorporation.springboot.crudrest.entity.Boxer;
import com.boxingcorporation.springboot.crudrest.service.BoxerService;

@RestController
@RequestMapping("/api")
public class BoxerRestController {

	private BoxerService boxerService;
	
	// quick and dirty: inject boxer dao (use constructor injection)
	@Autowired
	public BoxerRestController(BoxerService theBoxerService) {
		boxerService = theBoxerService;
	}
	
	// expose "/boxers" and return list of boxers
	
	@GetMapping("/boxers")
	public List<Boxer> findAll() {
		
		return boxerService.findAll();
		
	}
	
	// add mapping for GET /boxers/{boxerId}
	
	@GetMapping("/boxers/{boxerId}")
	public Boxer getBoxer(@PathVariable int boxerId) {
		
		Boxer theBoxer = boxerService.findById(boxerId);
		
		if (theBoxer == null) {
			throw new RuntimeException("Boxer id not found - " + boxerId);
		}
		
		return theBoxer;
		
	}
	
	// add mapping for POST /boxers - add new boxer
	
	@PostMapping("/boxers")
	public Boxer addBoxer(@RequestBody Boxer theBoxer) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		theBoxer.setId(0);
		
		boxerService.save(theBoxer);
		
		return theBoxer;
		
	}
	
	// add mapping for PUT /boxers - update existing boxer
	
	@PutMapping("/boxers")
	public Boxer updateBoxer(@RequestBody Boxer theBoxer) {

		boxerService.save(theBoxer);
		
		return theBoxer;
		
	}
	
	// add mapping for DELETE /boxers/{boxer} - delete boxer 
	
	@DeleteMapping("/boxers/{boxerId}")
	public String deleteBoxer(@PathVariable int boxerId) {
			
		Boxer theBoxer = boxerService.findById(boxerId);
		
		// throw exception if null
		
		if (theBoxer == null) {
			
			throw new RuntimeException("Boxer id not found - " + boxerId);
			
		}
		
		boxerService.deleteById(boxerId);
		
		return "Deleted boxer id - " + boxerId; 
		
	}
	
}
