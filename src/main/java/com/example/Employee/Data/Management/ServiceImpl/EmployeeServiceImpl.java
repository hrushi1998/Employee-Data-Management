package com.example.Employee.Data.Management.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.Data.Management.Entity.Employee;
import com.example.Employee.Data.Management.Repository.EmployeeRepository;
import com.example.Employee.Data.Management.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) 
	{
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) 
	{
		Employee emp = employeeRepository.getDataById(id);
		emp.setDob(employee.getDob());
		emp.setEmailId(employee.getEmailId());
		emp.setFirstName(employee.getFirstName());
		emp.setLastName(employee.getLastName());
		emp.setMobileNo(employee.getMobileNo());
	
		return employeeRepository.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() 
	{
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee deleteEmployee(long id) 
	{
		
		employeeRepository.deleteById(id);
		return null;
	}

	@Override
	public Employee getEmployeeById(long id)
	{
		// TODO Auto-generated method stub
		return employeeRepository.getEmployeeById(id);
	}

}
