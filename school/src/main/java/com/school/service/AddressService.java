package com.school.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.school.dao.Addressdao;
import com.school.model.Address;
@Component
public class AddressService {
	
	@Autowired
	Addressdao Dao;
	
	public Address create(Address add) {
		return Dao.create(add);
	}
	public List<Address> getAll(){
		return Dao.getAll();
	}
	


}
