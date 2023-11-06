package com.example.springbootbackend.service;

import java.util.List;
import com.example.springbootbackend.model.Employee;

public interface EmployeeService {
	List < Employee > getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}

