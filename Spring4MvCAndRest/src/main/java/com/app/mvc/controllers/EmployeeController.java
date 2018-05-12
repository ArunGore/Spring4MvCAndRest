package com.app.mvc.controllers;

import org.springframework.web.servlet.ModelAndView;

import com.app.beans.Employee;

public interface EmployeeController {
	public String getEmployeePage();

	public ModelAndView addEmployee(Employee employee);

}
