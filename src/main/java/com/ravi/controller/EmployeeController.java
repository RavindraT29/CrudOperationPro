package com.ravi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.entity.Employee;
import com.ravi.service.EmployeeService;

@Controller
@RestController
@RequestMapping("/ravi")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployes(){
		List<Employee> employees=employeeservice.findAll();
		return employees;
		
	}
    
	  @PostMapping("/add") 
	  public String addEmployee( @RequestBody Employee emp) {
	  return employeeservice.addEmployee(emp);
	  
	  }
	 
	@PostMapping("/bulkadd")
	public String AlladdEmployee( @RequestBody List<Employee> em) {
		return employeeservice.AlladdEmployee(em);
				
	}
	  @PutMapping("/update")
	  public String updateEmployee( @RequestBody Employee
	  emp) { 
		
		  return employeeservice.updateEmployee(emp); 
		  
	  }
	  @DeleteMapping("/all/{employeeid}") 
	  public String deleteEmployee( @PathVariable int employeeid) { 
		  return  employeeservice.deleteEmployee(employeeid);
	  
	  
	  
	  }
	 
}

