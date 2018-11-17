package com.cg.bankwallet.service;

import com.cg.bankwallet.bean.BankWalletBean;
import com.cg.bankwallet.exception.BankWalletException;


public interface IBankWalletService
{
	public boolean validate(BankWalletBean c) throws BankWalletException;
	public BankWalletBean createAccount(BankWalletBean c) throws BankWalletException;
	public double showBalance(String accountNumber);
	public double deposit(String accountNumber,double amount);
	public double withDraw(String accountNumber,double amount);
	public double fundTransfer(String accountNumbergSource,String accountNumberTarget,double amount);
	public BankWalletBean printTranscations(String accountNumber);
}
