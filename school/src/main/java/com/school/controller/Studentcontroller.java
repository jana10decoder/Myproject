package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.model.Student;
import com.school.service.Studentservice;
@RestController
@RequestMapping("student")
public class Studentcontroller {
	
	@Autowired
	Studentservice Service;
	 @PostMapping("add")
	public Student create(@RequestBody Student add) {
		return Service.create(add);
	}
	 @GetMapping("view")
	public List<Student> getAll(){
		return Service.getAll();
	}
	

}
