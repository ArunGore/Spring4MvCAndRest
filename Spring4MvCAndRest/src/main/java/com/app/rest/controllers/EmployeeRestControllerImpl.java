package com.app.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.beans.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/rest/employee")
public class EmployeeRestControllerImpl implements EmployeeRestController {
	@Autowired
	EmployeeService employeeService;

	@Override
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);

	}

	@Override
	@DeleteMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public void removeEmployee(@PathVariable int id) {
		employeeService.removeEmployee(id);

	}

	@Override
	@PutMapping
	@ResponseStatus(value = HttpStatus.OK)
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}

	@Override
	@GetMapping(value = "{/id}")
	public ResponseEntity<Employee> searchEmployee(@PathVariable int id) {
		Employee employee = employeeService.searchEmployee(id);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	@Override
	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> allEmployees = employeeService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(allEmployees, HttpStatus.OK);
	}

}
