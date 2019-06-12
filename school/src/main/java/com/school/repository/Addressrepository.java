package com.school.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.model.Address;
@Repository
public interface Addressrepository extends JpaRepository<Address, Long>{
	
	

}
