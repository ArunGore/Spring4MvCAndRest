package com.app.beans;

public class Employee {
	private int id;
	private String name;
	private String organization;
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
