package com.app.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/mvc/employee")
public class EmployeeController {

	@GetMapping("/getaddemployeepage")
	public String getEmployeePage() {
		return "employeeaddpage";
	}
	
}
