package com.app.mvc.controllers;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.app.beans.Employee;

public interface EmployeeController {
	public String getEmployeePage();

	public ModelAndView addEmployee(Employee employee);

	public String removeEmployee(int id, Model model);

	public String updateEmployee(Employee employee,Model model);

	public ModelAndView searchEmployee(int id);

}
