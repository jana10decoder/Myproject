package com.school.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.school.model.Address;
import com.school.repository.Addressrepository;
@Component
public class Addressdao {
	
	@Autowired
	Addressrepository Repository;
	
	public Address create(Address add) {
		return Repository.save(add);
	}
	public List<Address> getAll(){
		return Repository.findAll();
	}
	

}
