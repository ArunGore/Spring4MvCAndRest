package com.app.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.beans.Employee;

@Controller
@RequestMapping(value = "/mvc/employee")
public class EmployeeControllerImpl implements EmployeeController {

	@Override
	@GetMapping("/getaddemployeepage")
	public String getEmployeePage() {
		return "employeeaddpage";
	}

	@Override
	@PostMapping(value = "addemployee")
	public ModelAndView addEmployee(Employee employee) {
		ModelAndView modelAndView = new ModelAndView("employeeaddedpage");
		modelAndView.addObject("message", "employee added with id : ");
		return modelAndView;
	}

}
