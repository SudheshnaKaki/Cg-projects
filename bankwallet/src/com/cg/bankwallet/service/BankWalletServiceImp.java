package com.cg.bankwallet.service;

import com.cg.bankwallet.bean.BankWalletBean;
import com.cg.bankwallet.dao.BankWalletDaoImp;
import com.cg.bankwallet.dao.IBankWalletDao;
import com.cg.bankwallet.exception.BankWalletException;
import com.cg.bankwallet.exception.BankWalletExceptionMessage;

public class BankWalletServiceImp implements IBankWalletService {
	IBankWalletDao dao = new BankWalletDaoImp();

	@Override
	public boolean validate(BankWalletBean bankWalletBean) throws BankWalletException {
		if(bankWalletBean.getFirstName()==null || bankWalletBean.getLastName()==null){
			throw new BankWalletException(BankWalletExceptionMessage.ERROR1);
		}
		else if(bankWalletBean.getFirstName().trim().length() < 4 ||bankWalletBean.getLastName().trim().length() < 3){
			throw new BankWalletException(BankWalletExceptionMessage.ERROR1);
		}
		if (!(bankWalletBean.getFirstName().matches("[A-Za-z]*")))
			throw new BankWalletException(BankWalletExceptionMessage.ERROR1);
		
		if (!(bankWalletBean.getLastName().matches("[A-Za-z]*")))
			throw new BankWalletException(BankWalletExceptionMessage.ERROR1); 
		
		if ((bankWalletBean.getAge() < 18) || (bankWalletBean.getAge()>100))
			throw new BankWalletException(BankWalletExceptionMessage.ERROR2);
		
		if (!(bankWalletBean.getPhoneNumber().matches("^[7-9][0-9]{9}$")))
				throw new BankWalletException(BankWalletExceptionMessage.ERROR3);
				
		else if(bankWalletBean.getPhoneNumber()==null)
				throw new BankWalletException(BankWalletExceptionMessage.ERROR3);
		
		if (bankWalletBean.getPan().trim().length() != 10)
			throw new BankWalletException(BankWalletExceptionMessage.ERROR4);
		
		if(bankWalletBean.getPan().matches("[A-Z0-9]{10}"))
			throw new BankWalletException(BankWalletExceptionMessage.ERROR4);
		
		if ((bankWalletBean.getAddress().length() <= 4) || (bankWalletBean.getAddress()==null))
			throw new BankWalletException(BankWalletExceptionMessage.ERROR6);
		
		return true;
	}

	@Override
	public BankWalletBean createAccount(BankWalletBean bankWalletBean) throws BankWalletException {
		// TODO Auto-generated method stub
		validate(bankWalletBean);
		return dao.createAccount(bankWalletBean);
	}

	@Override
	public double showBalance(String accountNumber) {
		// TODO Auto-generated method stub
		return dao.showBalance(accountNumber);
	}

	@Override
	public double deposit(String accountNumber, double amount) {
		// TODO Auto-generated method stub
		return dao.deposit(accountNumber, amount);
	}

	@Override
	public double withDraw(String accountNumber, double amount) {
		// TODO Auto-generated method stub
		return dao.withDraw(accountNumber, amount);
	}

	@Override
	public double fundTransfer(String accountNumberSource,
			String accountNumberTarget, double amount) {
		// TODO Auto-generated method stub
		return dao.fundTransfer(accountNumberSource, accountNumberTarget,
				amount);
	}

	@Override
	public BankWalletBean  printTranscations(String accountNumber) {
		// TODO Auto-generated method stub
		return dao.printTranscations(accountNumber);
	}

}
