package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private PasswordEncoder encoder;

	@Override
	public Employee saveEmployee(Employee employee) {
		
		employee.setPassword(encoder.encode(employee.getPassword()));
		 return employeeRepository.save(employee);
		
	}

}
