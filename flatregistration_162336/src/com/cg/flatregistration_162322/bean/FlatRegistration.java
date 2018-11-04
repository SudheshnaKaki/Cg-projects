package com.cg.flatregistration_162322.bean;

public class FlatRegistration {

	private int ownerid;
	private String name;
	private int flattype;
	private double flatarea;
	private double rent;
	private double deposit;
	private int flatid;
	
	
	public int getFlatid() {
		return flatid;
	}
	public void setFlatid(int flatid) {
		this.flatid = flatid;
	}
	public int getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFlattype() {
		return flattype;
	}
	public void setFlattype(int flattype) {
		this.flattype = flattype;
	}
	public double getFlatarea() {
		return flatarea;
	}
	public void setFlatarea(double flatarea) {
		this.flatarea = flatarea;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	@Override
	public String toString() {
		return "[“Flat successfully registered. Registration id:<1001>”]";
	}
}
