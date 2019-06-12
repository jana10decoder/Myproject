package com.school.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "address")
public class Address {
	@Id @GeneratedValue
    @Column(name = "id")
    private long id;
 
    @Column(name = "street")
    private String street;
 
    @Column(name = "city")
    private String city;
 
    @Column(name = "country")
    private String country;
    private Student student; 
 
    public Address() {
 
    }
 
    //public Address(String street, String city, String country) {
       // this.street = street;
       // this.city = city;
        //this.country = country;
    //}
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getStreet() {
        return street;
    }
 
    public void setStreet(String street) {
        this.street = street;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public String getCountry() {
        return country;
    }
 
    public void setCountry(String country) {
        this.country = country;
    }
    @OneToOne(mappedBy = "address")
    public Student getStudent() {
	return student;
    }
	public void setStudent(Student student) {
		this.student = student;
	}
 }
    //@Override
    //public String toString() {
      //  return "Address [id=" + id + ", street=" + street + ", city=" + city
            //    + ", country=" + country + "]";
   // }


   

