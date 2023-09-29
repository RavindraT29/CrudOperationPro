package com.ravi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.entity.Employee;
import com.ravi.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository dao;
	
	public List<Employee>  findAll() {
       List<Employee>  employee=  dao.findAll();
		return employee;
	}
	
  public String addEmployee(Employee em) {
	  dao.save(em);
	  return "new Employee added in database"+em.getEmployeename();
	    
  }
  
  
  public String AlladdEmployee(List<Employee> emp) {
	  dao.saveAll(emp);
	  return " All new Employee added in database";
	   
  }
	   
  
	
	  public String updateEmployee(Employee emp) 
	  
	  { 
		  boolean resourcefound=false;
	    List<Employee> curentemp = (List<Employee>) dao.save(emp); 
	    for (Employee cure:curentemp) {
	    	if(cure.getEmployeeid()==emp.getEmployeeid()) {
	    		resourcefound=true;
	    		cure.setEmployeeid(emp.getEmployeeid());
	    		cure.setEmployeename(emp.getEmployeename());
	    		cure.setEmpaddrs(emp.getEmpaddrs());
	    		cure.setEmpdesignation(emp.getEmpdesignation());
	    		cure.setEmpMoNo(emp.getEmpMoNo());
	    	}
	    }
	    if(!resourcefound) {
	    	curentemp.add(emp);
	    	return "Employe  Added  Successfuly";
	    }
	  return "Employe  update  Successfuly";
	  
	  }
	  
		  public String deleteEmployee(int employeeid) { 
			  
			  
			  
	   Employee
		  emp=dao.getById(employeeid); 
		  dao.delete(emp);
		  return
		  " Employeeid is deleted "+employeeid; }
		
}
