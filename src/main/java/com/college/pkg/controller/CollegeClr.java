package com.college.pkg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.college.pkg.entity.CollegeEntity;
import com.college.pkg.repository.ClgRepository;
import com.college.pkg.service.collegeService;

@RestController
public class CollegeClr {
	
	@Autowired
	collegeService stdImp;
	
	@Autowired
	ClgRepository Repo;
	
	@GetMapping("/demo")
	public String Demo() {
		return "Hi ";
	}
	
	@PostMapping("/resister")
	public CollegeEntity stdValidation(@RequestBody CollegeEntity s) {
		CollegeEntity validation = stdImp.validation(s);
		return validation;
	}
	
	@GetMapping("/ById/{id}")
	public CollegeEntity getById(@PathVariable("id") int id) {
		CollegeEntity byId = stdImp.getById(id);
		return byId;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") int id) {
		stdImp.deleteById(id);
	}
	
	@GetMapping("/getAll")
	public List<CollegeEntity> getAll(){
		return stdImp.getAll();
	}
	
	@PutMapping("/update/{id}")
	public CollegeEntity update(@PathVariable("id") int id,@RequestBody CollegeEntity s) {
		return stdImp.update(id,s);
	}

}
