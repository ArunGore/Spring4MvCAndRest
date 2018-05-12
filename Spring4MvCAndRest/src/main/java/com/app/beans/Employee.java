package com.app.beans;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Employee {
	private int id;
	@NotEmpty(message = "Name should not be empty")
	private String name;
	@NotEmpty(message = "Organization should not be empty")
	private String organization;
	@NotNull(message = "Salary should not be empty")
	private float salary;

	public Employee() {
	}

	public Employee(int id, String name, String organization, float salary) {
		this.id = id;
		this.name = name;
		this.organization = organization;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
