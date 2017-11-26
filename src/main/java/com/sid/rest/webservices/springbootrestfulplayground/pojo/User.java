
package com.sid.rest.webservices.springbootrestfulplayground.pojo;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel("User model defination")
public class User {
	
	
	private Integer id;
	
	@Size(min=2, message="Name should have atleast two character")
	@ApiModelProperty(notes="minimum 2 charater required")
	private String name;
	
	@JsonIgnore
	@Past
	@ApiModelProperty(notes="Birth date should be in the past")
	private Date birthDate;
	
	protected User() {
		
	}

	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, birthDate=%s]", id, name, birthDate);
	}

}
