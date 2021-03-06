package com.app.mvc.controllers;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import com.app.beans.Employee;

public interface EmployeeController {
	public String getEmployeePage();

	public ModelAndView addEmployee(Employee employee, BindingResult bindingResult);

	public ModelAndView removeEmployee(int id, Model model);

	public String updateEmployee(Employee employee, BindingResult bindingResult, Model model);

	public ModelAndView searchEmployee(int id);

	public ModelAndView getAllEmployees();

}
