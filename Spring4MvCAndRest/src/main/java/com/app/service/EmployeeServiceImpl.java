package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.beans.Employee;
import com.app.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public int addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	}

	@Override
	public int removeEmployee(int id) {
		return employeeDao.removeEmployee(id);
	}

	@Override
	public int updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public Employee searchEmployee(int id) {
		return employeeDao.searchEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

}
