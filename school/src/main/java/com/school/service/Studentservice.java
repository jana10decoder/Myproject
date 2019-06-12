package com.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.school.dao.Studentdao;
import com.school.model.Student;
@Component
public class Studentservice {

	@Autowired
	Studentdao Dao;
	
	public Student create(Student add) {
		return Dao.create(add);
	}
	public List<Student> getAll(){
		return Dao.getAll();
	}
}
