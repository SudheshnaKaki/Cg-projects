package com.cg.bankwallet.dao;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.cg.bankwallet.bean.BankWalletBean;
import com.cg.bankwallet.db.BankWalletDB;

public class BankWalletDaoImp implements IBankWalletDao {
	private BankWalletDB database = new BankWalletDB();
	private List<BankWalletBean> bankDetails = database.dataBase();
	private List<BankWalletBean> trans = new ArrayList<BankWalletBean>();

	boolean isValid = false;
	String str = null;
	BankWalletBean b;

	
	@Override
	public BankWalletBean createAccount(BankWalletBean bean) {

		bean.setTime(LocalTime.now().toString());
		bean.setDeposit(0);
		bean.setWithdrawl(0);
		bean.setTranscationType("creation account");
		bankDetails.add(bean);
		return bean;
	}

	@Override
	public double showBalance(String accountNumber) {
		// TODO Auto-generated method stub
		double balance=0;
		for (BankWalletBean bean : bankDetails) {

			if (accountNumber.equals(bean.getPhoneNumber())) {
				balance = bean.getBalance();
			}
		}
		return balance;
	}

	@Override
	public double deposit(String accountNumber, double amount) {
		double balance=0;
		for (BankWalletBean bean : bankDetails) {

			if (bean.getPhoneNumber().equals(accountNumber)) {
				if (amount > 0) {
					bean.setBalance(bean.getBalance() + amount);
					BankWalletBean be = new BankWalletBean();
					be.setPhoneNumber(accountNumber);
					be.setBalance(bean.getBalance());
					be.setTime(LocalTime.now().toString());
					be.setDeposit(amount);
					be.setWithdrawl(0);
					be.setTranscationType("deposit");
					trans.add(be);
					balance = bean.getBalance();
					break;
				}
				else
					balance=0;
			} else {
				balance = 0;
			}
		}
		return balance;
	}

	@Override
	public double withDraw(String accountNumber, double amount) {
		double balance=0;
		for (BankWalletBean bean : bankDetails) {
			if (bean.getPhoneNumber().equals(accountNumber)) {
				balance = bean.getBalance() - amount;
				if (balance >= 0) {
					bean.setBalance(bean.getBalance() - amount);
					BankWalletBean be = new BankWalletBean();
					be.setPhoneNumber(accountNumber);
					be.setBalance(bean.getBalance());
					be.setTime(LocalTime.now().toString());
					be.setDeposit(0);
					be.setWithdrawl(amount);
					be.setTranscationType("withdrawl");
					trans.add(be);
					balance = bean.getBalance();
					break;
				}
				else
					balance=0;
			}
		}
		return balance;
	}

	@Override
	public double fundTransfer(String accountNumberSource,
			String accountNumberTarget, double amount) {
		double balance=0;
		BankWalletBean src = null;
		BankWalletBean dest = null;

		for (BankWalletBean bean : bankDetails) {

			if (accountNumberSource.equals(bean.getPhoneNumber()))
				src = bean;
			if (accountNumberTarget.equals(bean.getPhoneNumber()))
				dest = bean;
		}

		if (src != null) {
			if (src.getBalance() - amount >= 0) {
				src.setBalance(src.getBalance() - amount);
				BankWalletBean be = new BankWalletBean();
				be.setBalance(src.getBalance());
				be.setPhoneNumber(src.getPhoneNumber());
				be.setTime(LocalTime.now().toString());
				be.setWithdrawl(amount);
				be.setDeposit(0);
				be.setTranscationType("fund transfer");
				bankDetails.add(be);
				balance = src.getBalance();
			}

			if (dest == null) {
				src.setBalance(src.getBalance() + amount);
				BankWalletBean be = new BankWalletBean();
				be.setPhoneNumber(src.getPhoneNumber());
				be.setBalance(src.getBalance());
				be.setTime(LocalTime.now().toString());
				be.setWithdrawl(0);
				be.setDeposit(amount);
				be.setTranscationType("fund transfer");
				bankDetails.add(be);
				balance= src.getBalance();
			} else {
				BankWalletBean be = new BankWalletBean();
				be.setPhoneNumber(accountNumberTarget);
				be.setPhoneNumber(dest.getPhoneNumber());
				be.setBalance(dest.getBalance() + amount);
				be.setTime(LocalTime.now().toString());
				be.setDeposit(amount);
				be.setWithdrawl(0);
				be.setTranscationType("fund transfer");
				trans.add(be);

			}
		} else
			balance = 0;

		return balance;
	}

	@Override
	public BankWalletBean printTranscations(String accountNumber) {
		// TODO Auto-generated method stub
		for (BankWalletBean bankWalletBean : trans) {
			if (bankWalletBean.getPhoneNumber().equals(accountNumber))
			{
				b = bankWalletBean;
				System.out.println(b.toStr());
			}
		}
		return b;
	}
}
