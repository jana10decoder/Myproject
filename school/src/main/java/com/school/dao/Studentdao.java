package com.school.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.school.model.Student;
import com.school.repository.Studentrepository;
@Component
public class Studentdao {

	@Autowired
	Studentrepository Repository;
	
	public Student create(Student add) {
		return Repository.save(add);
	}
	public List<Student> getAll(){
		return Repository.findAll();
	}
	
	
}
