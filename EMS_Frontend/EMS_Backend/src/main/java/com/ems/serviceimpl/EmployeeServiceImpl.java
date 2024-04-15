package com.ems.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.Employee;
import com.ems.exception.EmployeeNotFoundException;
import com.ems.repository.EmployeeRepository;
import com.ems.service.EmployeeService;

@Service
// Implement all CRUD methods, all business logic
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	// Saving Employee details into table using save() of JPA Repository
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	// fetching all Employees from table
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	// fetching Employee details from table based on id, if not found then throw
	public Employee getEmployeeById(long id) {
		return employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Entered employee Id dose not exist"));
	}

	@Override
	// Updating Employee details based on id from table using save()
	public Employee updateEmployeeById(Employee employee, long id) {
		Employee newEmployee = employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Entered employee Id dose not exist"));

		// Set new values
		newEmployee.setFirstName(employee.getFirstName());
		newEmployee.setLastName(employee.getLastName());
		newEmployee.setEmailId(employee.getEmailId());

		// Saving updated Employee Details
		employeeRepository.save(newEmployee);
		return newEmployee;
	}

	@Override
	// Delete Employee Based on Id using deleteById()
	public void deleteEmployeeById(long id) {
		employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Entered employee Id dose not exist"));
		employeeRepository.deleteById(id);
	}

}
