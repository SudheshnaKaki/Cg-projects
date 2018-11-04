package com.capg.practice.bean;

public class TicketBean {
	private int id;
	private String transportCategoryId;
	private String when;
	private String reason;
	private String status = "new";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTransportCategoryId() {
		return transportCategoryId;
	}
	public void setTransportCategoryId(String transportCategoryId) {
		this.transportCategoryId = transportCategoryId;
	}
	public String getWhen() {
		return when;
	}
	public void setWhen(String when) {
		this.when = when;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
