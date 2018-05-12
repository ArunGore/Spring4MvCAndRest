package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.beans.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate template;

	@Override
	public int addEmployee(Employee employee) {
		return 0;
	}

	@Override
	public int removeEmployee(int id) {
		return 0;
	}

	@Override
	public int updateEmployee(Employee employee) {
		return 0;
	}

	@Override
	public Employee searchEmployee(int id) {
		return null;
	}

}
