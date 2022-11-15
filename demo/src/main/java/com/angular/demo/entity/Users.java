package com.angular.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Users {

	@Id
	@Column
    private long id;
	
	@Column
	private String firstName;
	
	@Column
    private String lastName;
	
	@Column
    private String email;
	
	public String toString() {
		return "User ID: " + id + " User email: " + email;
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
	
	public String getEmail() {
		return email;
	}
}
