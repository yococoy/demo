package com.yococoy.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
public class StaffContriller {
	
	@Autowired
	StaffRepository repository;
	
	@PostMapping
	public Staff save(@RequestBody Staff staff) {
		return repository.save(staff);
	}
	
	@GetMapping
	public List<Staff> findAll(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Staff load(@PathVariable String id) {
		return repository.findById(id).get();
	}
	
	@GetMapping("/")
	public Staff find(@RequestParam("n") String name) {
		return repository.findByName(name);
	}

}
