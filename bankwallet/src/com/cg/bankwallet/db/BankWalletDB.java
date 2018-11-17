package com.cg.bankwallet.db;

import java.util.ArrayList;

import com.cg.bankwallet.bean.BankWalletBean;

public class BankWalletDB {

	static ArrayList<BankWalletBean> walletDetails = new ArrayList<BankWalletBean>();

	public ArrayList<BankWalletBean> dataBase() {

		BankWalletBean b1 = new BankWalletBean();
		b1.setFirstName("rohini");
		b1.setLastName("thunuguntla");
		b1.setAge(20);
		b1.setPhoneNumber("9059900989");
		b1.setPan("1234567890");
		b1.setAddress("vijayawada");
		b1.setBalance(5000);
		b1.setTime("14-10-2018  1:00pm");
		walletDetails.add(b1);
		
		BankWalletBean b2 = new BankWalletBean();
		b2.setFirstName("sowji");
		b2.setLastName("nayana");
		b2.setAge(20);
		b2.setPhoneNumber("9032974524");
		b2.setPan("1234567890");
		b2.setAddress("vijayawada");
		b2.setBalance(5000);
		b2.setTime("14-04-2018  9:47am");
		walletDetails.add(b2);

		BankWalletBean b3 = new BankWalletBean();
		b3.setFirstName("dhoni");
		b3.setLastName("tsdffsa");
		b3.setAge(20);
		b3.setPhoneNumber("8886385538");
		b3.setPan("12345qwert");
		b3.setAddress("vijayawada");
		b3.setBalance(3000);
		b3.setTime("1-5-2018  10:00am");
		walletDetails.add(b3);

		BankWalletBean b4 = new BankWalletBean();
		b4.setFirstName("sachin");
		b4.setLastName("thunuguntla");
		b4.setAge(20);
		b4.setPhoneNumber("9492476179");
		b4.setPan("1234567890");
		b4.setAddress("vijayawada");
		b4.setBalance(5000);
		b4.setTime("15-11-2016  12:00am");
		walletDetails.add(b4);

		BankWalletBean b5 = new BankWalletBean();
		b5.setFirstName("rohit");
		b5.setLastName("thunuguntla");
		b5.setAge(20);
		b5.setPhoneNumber("9542724356");
		b5.setPan("1234567890");
		b5.setAddress("vijayawada");
		b5.setBalance(5000);
		b5.setTime("12-01-2017  9.40am");
		walletDetails.add(b5);

		return walletDetails;
	}
}
