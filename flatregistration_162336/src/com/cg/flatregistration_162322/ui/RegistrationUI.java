package com.cg.flatregistration_162322.ui;

import java.util.Scanner;

import com.cg.flatregistration_162322.bean.FlatRegistration;
import com.cg.flatregistration_162322.service.Iservice;
import com.cg.flatregistration_162322.service.SeviceImp;

public class RegistrationUI {

	public static void main(String[] args) {
		FlatRegistration flatreg = new FlatRegistration();
		Iservice service = new SeviceImp();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Flat Registration");
			System.out.println("2.Exit");
			int option = sc.nextInt();
			switch (option) {
			case 1:

				System.out.println("Existing Owner IDSAre" + service.getAllOwnerIds());
				System.out.println("Please enter your owner id from above list");
				int oid = sc.nextInt();
				System.out.println("Select Flat Type (1-1BHK, 2-2BHK):");
				int flattype = sc.nextInt();
				System.out.println("Enter Flat area in sq. ft.: ");
				double area = sc.nextDouble();
				System.out.println("Enter desired rent amount Rs: ");
				double rent = sc.nextDouble();
				System.out.println("Enter desired deposit amount Rs: ");
				double deposit = sc.nextDouble();
				flatreg.setOwnerid(oid);
				flatreg.setFlattype(flattype);
				flatreg.setFlatarea(area);
				flatreg.setRent(rent);
				flatreg.setDeposit(deposit);
				if (service.isValidation(flatreg))
					System.out.println(service.registerFlat(flatreg));
				else
					System.out.println("not done ");
				break;
			case 2:
				System.exit(0);
				break;

			default:
				break;
			}

		}
	}

}
