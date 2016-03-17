package com.bean;

public class Payment {

	private String payid;
	private String rate;
	private String permitCost;
	private String driverCharge;
	public String getPayid() {
		return payid;
	}
	public void setPayid(String payid) {
		this.payid = payid;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getPermitCost() {
		return permitCost;
	}
	public void setPermitCost(String permitCost) {
		this.permitCost = permitCost;
	}
	public String getDriverCharge() {
		return driverCharge;
	}
	public void setDriverCharge(String driverCharge) {
		this.driverCharge = driverCharge;
	}
}
