package com.capg.ems.service;

import java.util.ArrayList;

import com.capg.ems.bean.Employee;

public interface IEmployeeService {
	
	
	public boolean addEmployee(Employee e);
	
	public Employee displayEmployee(int eid);
	
	public ArrayList<Employee> displayAll();
	
	
	public boolean validateData(Employee e);
	 public Employee delete(int eid);

		
		
	

}
