package com.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.app.beans.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate template;

	@Override
	public int addEmployee(Employee employee) {
		final String query = "insert into employee values(?,?,?,?)";

		int val = template.update(query, employee.getId(), employee.getName(), employee.getOrganization(),
				employee.getSalary());

		return val;
	}

	@Override
	public int removeEmployee(int id) {
		final String query = "delete from employee where id=?";
		int val = template.update(query, id);
		return val;
	}

	@Override
	public int updateEmployee(Employee employee) {
		final String query = "update employee set name=?,organization=?,salary=? where id=?";

		int val = template.update(query, employee.getName(), employee.getOrganization(), employee.getSalary(),
				employee.getId());

		return val;
	}

	@Override
	public Employee searchEmployee(int id) {
		final String query = "select * from employee where id=?";
		Employee employee = template.queryForObject(query, (rs, i) -> {

			return new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("organization"),
					rs.getFloat("salary"));
		}, id);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		final String query = "select * from employee";
		List<Employee> list = template.query(query, (rs, rowNum) -> {
			Employee employee = new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("organization"),
					rs.getFloat("salary"));
			return employee;
		});

		return list;
	}

}
