package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.model.Address;
import com.school.service.AddressService;
@RestController
@RequestMapping("address")
public class Addresscontroller {
	
	@Autowired
	AddressService Service;
	@PostMapping("add")
	public Address create(@RequestBody Address add) {
		return Service.create(add);
	}
	 @GetMapping("view")
	public List<Address> getAll(){
		return Service.getAll();
	}
	
	

}
