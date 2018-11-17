package com.capg.ems.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.capg.ems.bean.Employee;
import com.capg.ems.exception.EmployeeNotFound;
import com.capg.ems.service.EmployeeServiceImp;
import com.capg.ems.service.IEmployeeService;

public class Client {

	public static void main(String[] args) {
		
		IEmployeeService service = new EmployeeServiceImp();
		
		while(true) {
		System.out.println("***WELCOME TO EMS***");
		
		System.out.println("1. Add Employee");
		System.out.println("2. Display Employee");
		System.out.println("3.All Employees");
	    System.out.println("4.delete");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter Eid");
				int eid = sc.nextInt();
				System.out.println("Enter Ename");
				String ename = sc.next();
				System.out.println("Enter salary");
				double sal = sc.nextDouble();

				Employee e = new Employee();
				e.setEid(eid);
				e.setEname(ename);
				e.setSal(sal);

				boolean isValid = service.validateData(e);

				if (isValid) {

					boolean isAdded = service.addEmployee(e);
					if (isAdded) {

						System.out.println("Thank You....");
						System.out.println(e);

					} else {
						System.out.println("Not added");
					}

				} else {
					System.err.println("Invalid Data");
				}

				break;
			case 2:
				System.out.println("Enter Eid to search");
				int id = sc.nextInt();
				Employee emp = service.displayEmployee(id);
				
				if(emp != null) {
				System.out.println(emp);
				}
				else {
					try {
					throw new EmployeeNotFound();
					}
					catch(EmployeeNotFound e1) {
						System.err.println("Employee doesnot exist");
					}
					
					
				}
				
				
				break;
			case 3:
				ArrayList<Employee> empList = service.displayAll();
				if(empList != null) {
					Iterator<Employee> it = empList.iterator();
					while(it.hasNext()) {
						Employee e1 = it.next();
						System.out.println(e1);
						
					}
				}
				break;
			case 4:
				System.out.println("Enter eid");
				int id1 = sc.nextInt();
				Employee empObj = service.delete(id1);
				System.out.println(empObj);
				System.out.println("data removed");
				break;

			default:
				break;

			}
		}

	}

}
