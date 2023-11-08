package com.cocoball.app.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Long id;
	  private String firstName;
	  private String lastName;

	  // 1 대 다
	  //@OneToMany
	  //List<Employee>
	  
	  
	  protected Customer() {}

	  public Customer(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	  }

	  @Override
	  public String toString() {
	    return String.format(
	        "Customer[id=%d, firstName='%s', lastName='%s']",
	        id, firstName, lastName);
	  }

	  public Long getId() {
	    return id;
	  }

	  public String getFirstName() {
	    return firstName;
	  }

	  public String getLastName() {
	    return lastName;
	  }
	}