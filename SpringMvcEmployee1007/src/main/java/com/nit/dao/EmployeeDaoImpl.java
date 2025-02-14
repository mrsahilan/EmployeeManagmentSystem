package com.nit.dao;

import static com.nit.constant.Constant.DELETE;
import static com.nit.constant.Constant.GET_ALL;
import static com.nit.constant.Constant.GET_ONE;
import static com.nit.constant.Constant.INSERT;
import static com.nit.constant.Constant.UPDATE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.nit.model.Employee;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao 
{
	@Autowired
	private EmployeeRowMapper employeeRowMapper;
	
	@Override
	public List<Employee> getAllEmployees()
	{
		return getJdbcTemplate().query(GET_ALL, employeeRowMapper);
	}

	@Override
	public void saveEmployee(Employee emp) 
	{
		getJdbcTemplate().update(INSERT, emp.getName(), emp.getAddress(), emp.getSalary());
	}

	@Override
	public void updateEmployee(Employee emp) 
	{
		getJdbcTemplate().update(UPDATE, emp.getName(), emp.getAddress(), emp.getSalary(), emp.getId());
	}

	@Override
	public Employee getEmployee(Integer id) 
	{
		List<Employee> emps = getJdbcTemplate().query(GET_ONE, new Object[] {id}, employeeRowMapper);
		return emps.get(0);
	}

	@Override
	public void deleteEmployee(Integer id) 
	{
		getJdbcTemplate().update(DELETE, id);
	}

}
