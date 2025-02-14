package com.nit.dao;

import java.util.List;

import com.nit.model.Employee;

public interface EmployeeDao
{
	public List<Employee> getAllEmployees();
	public void saveEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public Employee getEmployee(Integer id);
	public void deleteEmployee(Integer id);
}
