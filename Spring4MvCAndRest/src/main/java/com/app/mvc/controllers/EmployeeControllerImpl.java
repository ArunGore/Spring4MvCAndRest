package com.app.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.beans.Employee;
import com.app.service.EmployeeService;

@Controller
@RequestMapping(value = "/mvc/employee")
public class EmployeeControllerImpl implements EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@Override
	@GetMapping("/getaddemployeepage")
	public String getEmployeePage() {
		return "employeeAddPage";
	}

	@Override
	@PostMapping(value = "/addemployee")
	public ModelAndView addEmployee(Employee employee) {
		int val = employeeService.addEmployee(employee);
		String message = null;

		if (val == 1) {
			message = "Employee addedd sucessfully....";
		} else {
			message = "Employee not addedd sucessfully....";
		}

		ModelAndView modelAndView = new ModelAndView("employeeResultPage");
		modelAndView.addObject("message", message);
		return modelAndView;
	}

	@Override
	@GetMapping(value = "removeemployee")
	public ModelAndView removeEmployee(@RequestParam("employeeId") int id, Model model) {
		int val = employeeService.removeEmployee(id);
		String message = null;

		if (val == 1) {
			message = "Employee removed sucessfully....";
		} else {
			message = "Employee not removed sucessfully....";
		}

		ModelAndView modelAndView = new ModelAndView("employeeResultPage");
		modelAndView.addObject("message", message);
		return modelAndView;
	}

	@Override
	@PostMapping(value = "updateemployee")
	public String updateEmployee(Employee employee, Model model) {
		int val = employeeService.updateEmployee(employee);
		String message = null;
		if (val > 0) {
			message = "Employee updated sucessfully....";
		} else {
			message = "Employee not updated sucessfully....";
		}

		model.addAttribute("message", message);
		return "employeeResultPage";
	}

	@Override
	@GetMapping(value = "searchemployee")
	public ModelAndView searchEmployee(@RequestParam("employeeId") int id) {
		Employee searchedEmployee = employeeService.searchEmployee(id);
		ModelAndView modelAndView = new ModelAndView("employeeUpdatePage");
		modelAndView.addObject("employee", searchedEmployee);
		return modelAndView;
	}

	@Override
	@GetMapping(value = "getallemployees")
	public ModelAndView getAllEmployees() {
		List<Employee> employees = employeeService.getAllEmployees();
		ModelAndView modelAndView = new ModelAndView("listAllEmployees");
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}

}
