package com.capg.ems.service;

import java.util.ArrayList;

import com.capg.ems.bean.Employee;
import com.capg.ems.dao.EmployeeDAOImp;
import com.capg.ems.dao.IEmployeeDAO;

public class EmployeeServiceImp implements IEmployeeService {
	
	IEmployeeDAO dao = new EmployeeDAOImp();

	@Override
	public boolean addEmployee(Employee e) {
		
		return dao.addEmployee(e);
	}

	@Override
	public Employee displayEmployee(int eid) {
		
		return dao.displayEmployee(eid);
		
	}

	@Override
	public Employee delete(int eid) {
		
		return dao.delete(eid);
	}

	@Override
	public ArrayList<Employee> displayAll() {
		
		return dao.displayAll();
		
	}
	
	public boolean validateData(Employee e) {
		boolean isValid = false;
		
		if(e.getEname().length() > 4 && e.getSal() > 5000) {
			
			isValid = true;
			
			
			
		}
		return isValid;
	}

}
