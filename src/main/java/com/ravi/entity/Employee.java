package com.ravi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table ( name="/Emps")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer employeeid;
	private String employeename;
	private String empdesignation;
	private String empaddrs;
	private long   empMoNo;
	
	
	public Employee() {
		
	}
	
	public Employee(Integer employeeid, String employeename, String empdesignation, String empaddrs, long empMoNo) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.empdesignation = empdesignation;
		this.empaddrs = empaddrs;
		this.empMoNo = empMoNo;
	}

	public Integer getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	public String getEmpaddrs() {
		return empaddrs;
	}
	public void setEmpaddrs(String empaddrs) {
		this.empaddrs = empaddrs;
	}
	public long getEmpMoNo() {
		return empMoNo;
	}
	public void setEmpMoNo(long empMoNo) {
		this.empMoNo = empMoNo;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", empdesignation="
				+ empdesignation + ", empaddrs=" + empaddrs + ", empMoNo=" + empMoNo + "]";
	}


}
