package com.capg.ems.dao;

import java.util.ArrayList;

import com.capg.ems.bean.Employee;

public interface IEmployeeDAO {

	
	
	
	public boolean addEmployee(Employee e);
	
	public Employee displayEmployee(int eid);
	
	public ArrayList<Employee> displayAll();
	 public Employee delete(int eid);
	

}
