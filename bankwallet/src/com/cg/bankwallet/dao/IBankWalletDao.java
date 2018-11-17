package com.cg.bankwallet.dao;

import com.cg.bankwallet.bean.BankWalletBean;

public interface IBankWalletDao 
{
	
	public BankWalletBean createAccount(BankWalletBean c);
	public double showBalance(String accountNumber);
	public double deposit(String accountNumber,double amount);
	public double withDraw(String accountNumber,double amount);
	public double fundTransfer(String accountNumbergSource,String accountNumberTarget,double amount);
	public BankWalletBean  printTranscations(String accountNumber);
}
