package com.ai.ai003.EmployeeRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ai.ai003.EmployeeEntity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long>
{
	
}
