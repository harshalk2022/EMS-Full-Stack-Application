package com.ems.service;

import java.util.List;

import com.ems.entity.Employee;

// Abstract method for performing CRUD on entity Employee
public interface EmployeeService {

	// Method to save employee Details
	Employee saveEmployee(Employee employee);

	// Method to fetch All employee
	List<Employee> getAllEmployees();

	// Method to fetch employee details using Id
	Employee getEmployeeById(long id);

	// Method to update employee details based on id
	Employee updateEmployeeById(Employee employee, long id);

	// Method to delete employee based on id
	void deleteEmployeeById(long id);
}
