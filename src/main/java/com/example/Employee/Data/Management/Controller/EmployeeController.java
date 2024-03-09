package com.example.Employee.Data.Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.Data.Management.Entity.Employee;
import com.example.Employee.Data.Management.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController
{
	@Autowired
     private EmployeeService employeeService;
	
	@PostMapping("/employee")
	public ResponseEntity<?> insertEmployee(@RequestBody Employee employee)
	{
		try
		{
			return new ResponseEntity<>(employeeService.saveEmployee(employee),HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
		} 
		
	}
	
	@GetMapping("/employee")
	public ResponseEntity<?> getAllEmployee()
	{
		try
		{
			return new ResponseEntity<>(employeeService.getAllEmployee(),HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
		}
	}
	@GetMapping("/emlpoyee/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable("id") long id)
	{
		
		try
		{
			return new ResponseEntity<>(employeeService.getEmployeeById(id),HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
		} 
		
     }
	
	@PutMapping("/employee/{id}")
	public ResponseEntity<?> updateEmployee(@RequestBody Employee employee,@PathVariable("id") long id)
	{
		try
		{
			return new ResponseEntity<>(employeeService.updateEmployee(employee, id),HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
		} 
		
		
	}
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable("id") long id)
	{
		try
		{
			return new ResponseEntity<>(employeeService.deleteEmployee(id),HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
		} 	
	}
	

}
