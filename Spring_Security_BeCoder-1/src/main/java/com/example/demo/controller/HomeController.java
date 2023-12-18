package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Controller
@ResponseBody
public class HomeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee/index")
	public String index()
	{
		return "<h1>index Page</h1>";
	}
	
	
	@GetMapping("/employee/home")
	public String home()
	{
		return "<h1>Home Page</h1>";
	}
	
	
	@GetMapping("/employee/about")
	public String about()
	{
		return "<h1>About Page</h1>";
	}
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}
}
