package com.example.Employee.Data.Management.Service;

import java.util.List;

import com.example.Employee.Data.Management.Entity.Employee;

public interface EmployeeService 
{
	Employee getEmployeeById(long id);
	
	Employee saveEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee, long id);
	
	List<Employee> getAllEmployee();
	
	Employee deleteEmployee(long id);
	
}
