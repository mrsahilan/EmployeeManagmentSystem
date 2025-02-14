package com.nit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nit.dao.EmployeeDao;
import com.nit.model.Employee;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeDao dao;

	@RequestMapping("/getAllEmployees")
	public ModelAndView getAllEmployees() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("show_all_employees");
		List<Employee> emps = dao.getAllEmployees();
		modelAndView.addObject("emps", emps);
		return modelAndView;
	}

	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("add_employee");
		return modelAndView;
	}

	@RequestMapping("/saveEmployee")
	public String addEmployee(HttpServletRequest request) {
		String name = request.getParameter("emp_name");
		String address = request.getParameter("emp_address");
		String salary = request.getParameter("emp_salary");
		Employee emp = new Employee(name, address, Double.valueOf(salary));
		dao.saveEmployee(emp);
		return "redirect:/getAllEmployees";
	}

	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(HttpServletRequest request) {
		String empId = request.getParameter("emp_id");
		dao.deleteEmployee(Integer.valueOf(empId));
		return "redirect:/getAllEmployees";
	}
}
