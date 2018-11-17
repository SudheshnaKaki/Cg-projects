package com.capg.ems.dao;

import java.util.ArrayList;
import java.util.Iterator;

import com.capg.ems.bean.Employee;

public class EmployeeDAOImp implements IEmployeeDAO {

	ArrayList<Employee> empList = new ArrayList<Employee>();

	@Override
	public boolean addEmployee(Employee e) {

		return empList.add(e);

	}

	@Override
	public Employee displayEmployee(int eid) {
		Employee emp = null;

		for (Employee e : empList) {
			if (eid == e.getEid()) {
				emp = e;

			}
		}
		return emp;
	}

	public boolean updateEmployee(Employee e) {

		for (Employee emp : empList) {
			if (e.getEid() == emp.getEid()) {
				emp.setEname(e.getEname());
				emp.setSal(e.getSal());

			}

		}
		return true;
	}

	public Employee delete(int eid) {
		Employee e1 = null;
		Iterator<Employee> it = empList.iterator();
		while (it.hasNext()) {
			e1 = it.next();
			if (eid == e1.getEid()) {
				it.remove();
				break;
			}
		}
		return e1;
	}

	@Override
	public ArrayList<Employee> displayAll() {
		// TODO Auto-generated method stub
		return empList;
	}

}
