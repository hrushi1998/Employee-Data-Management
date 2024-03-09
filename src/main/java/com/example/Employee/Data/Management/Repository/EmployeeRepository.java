package com.example.Employee.Data.Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee.Data.Management.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> 
{

	Employee getDataById(Long id);

	Employee getEmployeeById(Long id);
  
}
