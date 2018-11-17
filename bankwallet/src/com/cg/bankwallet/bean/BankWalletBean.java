package com.cg.bankwallet.bean;

public class BankWalletBean 
{
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	private String phoneNumber;
	private	String pan;
	private double balance;
	private double deposit;
	private double withdrawl;
	private String time;
	private String transcationType;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getTranscationType() {
		return transcationType;
	}
	public void setTranscationType(String transcationType) {
		this.transcationType = transcationType;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getWithdrawl() {
		return withdrawl;
	}
	public void setWithdrawl(double withdrawl) {
		this.withdrawl = withdrawl;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	@Override
	public String toString() {
		return "BankWalletBean [firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", pan=" + pan
				+ ", balance=" + balance + ", deposit=" + deposit
				+ ", withdrawl=" + withdrawl + ", time=" + time
				+ ", transcationType=" + transcationType + "]";
	}
	
	public String toStr() {
		return " customerid=" + phoneNumber
				+ ", balance=" + balance + ", deposit=" + deposit
				+ ", withdrawl=" + withdrawl + ", time=" + time + ", transcationType=" + transcationType;
	}
	
}
