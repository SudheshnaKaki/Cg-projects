package com.cg.bankwallet.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.bankwallet.bean.BankWalletBean;
import com.cg.bankwallet.exception.BankWalletException;
import com.cg.bankwallet.service.BankWalletServiceImp;
import com.cg.bankwallet.service.IBankWalletService;

public class BankWalletServiceImpTest {
	private static IBankWalletService service;
	boolean result;
	double balance;

	@BeforeClass
	public static void createInstance() {
		service = new BankWalletServiceImp();
	}

	@Test
	public void testCreateAccount() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName("raju");
		bean.setLastName("krishna");
		bean.setPhoneNumber("8886385538");
		bean.setAddress("novotel");
		bean.setAge(22);
		bean.setPan("qwertyuiop");
		result = service.validate(bean);
		Assert.assertTrue(result);
	}

	@Test(expected = BankWalletException.class)
	public void testCreateAccountNegative() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName("raju");
		bean.setLastName("krishna");
		bean.setPhoneNumber("888");
		bean.setAddress("novotel");
		bean.setAge(22);
		bean.setPan("qwertyuiop");
		result = service.validate(bean);
		Assert.assertFalse(result);
	}

	@Test(expected = BankWalletException.class)
	public void testFirstNameNotNull() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName(null);
		bean.setLastName("krishna");
		bean.setPhoneNumber("8886385538");
		bean.setAddress("novotel");
		bean.setAge(22);
		bean.setPan("qwertyuiop");
		service.validate(bean);
	}

	@Test(expected = BankWalletException.class)
	public void testPhoneNumberNegative() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName("raju");
		bean.setLastName("krishna");
		bean.setPhoneNumber("888");
		bean.setAddress("novotel");
		bean.setAge(22);
		bean.setPan("qwertyuiop");
		result = service.validate(bean);
		Assert.assertFalse(result);
	}

	@Test(expected = BankWalletException.class)
	public void testLastNameNotNull() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName("krishna");
		bean.setLastName(null);
		bean.setPhoneNumber("8886385538");
		bean.setAddress("novotel");
		bean.setAge(22);
		bean.setPan("qwertyuiop");
		service.validate(bean);
	}

	@Test(expected = BankWalletException.class)
	public void testAddressLength() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName("krishna");
		bean.setLastName("sdfsdf");
		bean.setPhoneNumber("8886385538");
		bean.setAddress("sff");
		bean.setAge(22);
		bean.setPan("qwertyuiop");
		boolean result = service.validate(bean);
		assertFalse(result);
	}

	@Test
	public void testAge() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName("raju");
		bean.setLastName("krishna");
		bean.setPhoneNumber("8886385538");
		bean.setAddress("novotel");
		bean.setAge(20);
		bean.setPan("qwertbvnfu");
		boolean result = service.validate(bean);
		assertTrue(result);

	}

	@Test(expected = BankWalletException.class)
	public void testAgeNegative() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName("raju");
		bean.setLastName("krishna");
		bean.setPhoneNumber("8886385538");
		bean.setAddress("novotel");
		bean.setAge(2);
		bean.setPan("qwertbvnfu");
		service.validate(bean);
	}

	@Test
	public void testPan() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName("raju");
		bean.setLastName("krishna");
		bean.setPhoneNumber("8886385538");
		bean.setAddress("novotel");
		bean.setAge(26);
		bean.setPan("qwertbvnfu");
		boolean result = service.validate(bean);
		assertTrue(result);

	}

	@Test(expected = BankWalletException.class)
	public void testPanLength() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName("raju");
		bean.setLastName("krishna");
		bean.setPhoneNumber("8886385538");
		bean.setAddress("novotel");
		bean.setAge(26);
		bean.setPan("tyuiop");
		service.validate(bean);
	}

	@Test(expected = BankWalletException.class)
	public void testFirstName() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName("asdf4556");
		bean.setLastName("krishna");
		bean.setPhoneNumber("8886385538");
		bean.setAddress("novotel");
		bean.setAge(26);
		bean.setPan("tyuiop");
		service.validate(bean);
	}

	@Test(expected = BankWalletException.class)
	public void testLastName() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName("asdfasdf");
		bean.setLastName("krishna56465");
		bean.setPhoneNumber("8886385538");
		bean.setAddress("novotel");
		bean.setAge(26);
		bean.setPan("tyuiop");
		service.validate(bean);
	}

	@Test(expected = BankWalletException.class)
	public void testPhoneNumber() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName("asdfasdf");
		bean.setLastName("krishna56465");
		bean.setPhoneNumber("885645edfg");
		bean.setAddress("novotel");
		bean.setAge(26);
		bean.setPan("tyuiop");
		service.validate(bean);
	}

	@Test(expected = BankWalletException.class)
	public void testPhoneNumberForNull() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName("asdfasdf");
		bean.setLastName("krishna56465");
		bean.setPhoneNumber(null);
		bean.setAddress("novotel");
		bean.setAge(26);
		bean.setPan("tyuiop");
		service.validate(bean);
	}

	@Test(expected = BankWalletException.class)
	public void testPanCheck() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName("asdfasdf");
		bean.setLastName("krishna56465");
		bean.setPhoneNumber(null);
		bean.setAddress("novotel");
		bean.setAge(26);
		bean.setPan("tyuiop@");
		service.validate(bean);
	}

	@Test(expected = BankWalletException.class)
	public void testAgeNumber() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean.setFirstName("asdfasdf");
		bean.setLastName("krishna56465");
		bean.setPhoneNumber("8886385538");
		bean.setAddress("novotel");
		bean.setAge(105);
		bean.setPan("12345ASDFG");
		service.validate(bean);
	}

	@Test
	public void testDeposit() throws BankWalletException {
		balance = service.deposit("9542724356", 200);
		assertEquals(5200, balance, 0);
	}

	@Test
	public void testDepositForWrongNumber() throws BankWalletException {
		balance = service.deposit("9123456789", 200);
		assertEquals(0, balance, 0);
	}

	@Test
	public void testDepositNegitive() throws BankWalletException {
		balance = service.deposit("8886385538", -200);
		assertEquals(0, balance, 0);
	}

	@Test
	public void testWithDrawl() throws BankWalletException {
		balance = service.withDraw("9542724356", 200);
		assertEquals(5000, balance, 0);
	}

	@Test
	public void testWithDrawlNegetive() throws BankWalletException {
		balance = service.deposit("8886385538", -200);
		assertEquals(0, balance, 0);
	}

	@Test
	public void testWithDrwalForWrongNumber() throws BankWalletException {
		balance = service.withDraw("8886385549", 200);
		assertEquals(0, balance, 0);
	}

	@Test
	public void testWithDrwalMoreAmount() throws BankWalletException {
		balance = service.withDraw("8886385538", 200000);
		assertEquals(0, balance, 0);
	}

	@Test
	public void testFundTransfer() throws BankWalletException {
		balance = service.fundTransfer("8886385538", "9492476179", 500);
		
		assertEquals(2500, balance, 0);
	}

	@Test
	public void testFundTransforSourceWrong() throws BankWalletException {
		balance = service.fundTransfer("9492476110", "8886385538", 200);
		assertEquals(0.0, balance, 0);
	}

	@Test
	public void testFundTransforDestinationWrong() throws BankWalletException {
		balance = service.fundTransfer("9492476179", "8886385579", 200);
		assertEquals(5000, balance, 0);
	}

	@Test
	public void testFundTransforAmount() throws BankWalletException {
		balance = service.fundTransfer("9492476179", "8886385538", 20000);
		assertEquals(0, balance, 0);
	}

	@Test
	public void testViewBalance() throws BankWalletException {
		balance = service.showBalance("9059900989");
		//System.out.println(balance);
		assertEquals(5000, balance, 0);
	}

	@Test
	public void testViewBalanceWrongNumber() throws BankWalletException {
		balance = service.showBalance("9059791234");
		assertEquals(0, balance, 0);
	}

	@Test
	public void testTranscations() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean = service.printTranscations("8886385538");
		//System.out.println(bean.toStr());
		assertNotNull(bean);
	}

	@Test
	public void testTranscationsWrongNumber() throws BankWalletException {
		BankWalletBean bean = new BankWalletBean();
		bean = service.printTranscations("9032974580");
		
		assertNull(bean);
	}
}
