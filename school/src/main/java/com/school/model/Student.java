package com.school.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "student")
public class Student {
	@Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
 
    @Column(name = "firstName")
    private String firstName;
 
    @Column(name = "lastName")
    private String lastName;
 
    @Column(name = "section")
    private String section;
 
  
    private Address address;
    public Student() {
 
    }
 
  //  public Student(String firstName, String lastName, String section) {
    //    this.firstName = firstName;
   //     this.lastName = lastName;
    //    this.section = section;
  //  }
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public String getSection() {
        return section;
    }
 
    public void setSection(String section) {
        this.section = section;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
    public Address getAddress() {
        return address;
    }
 
    public void setAddress(Address address) {
        this.address = address;
    }
 
    @Override
    public String toString() {
        return String.format("Student [id=" + id + ", firstName=" + firstName + ", lastName="
                + lastName + ", section=" + section + ", address=" + address
                + "]",id,address.getStreet(),address.getCity(),address.getCountry());
    }
 

}
