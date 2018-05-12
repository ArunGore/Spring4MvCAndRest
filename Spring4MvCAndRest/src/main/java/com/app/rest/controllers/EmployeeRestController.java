package com.app.rest.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.app.beans.Employee;

public interface EmployeeRestController {

	public void addEmployee(Employee employee);

	public void removeEmployee(int id);

	public void updateEmployee(Employee employee);

	public ResponseEntity<Employee> searchEmployee(int id);

	public ResponseEntity<List<Employee>> getAllEmployees();

}
