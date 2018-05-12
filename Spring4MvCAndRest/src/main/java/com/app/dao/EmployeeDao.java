package com.app.dao;

import com.app.beans.Employee;

public interface EmployeeDao {
	public int addEmployee(Employee employee);

	public int removeEmployee(int id);

	public int updateEmployee(Employee employee);

	public Employee searchEmployee(int id);

}
