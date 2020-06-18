package com.simulation.atm.model;

public class Customer {
	private int accountnumber;
	private String name;
	private String address;
	private int numberoftransaction;
	private int count;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumberoftransaction() {
		return numberoftransaction;
	}
	public void setNumberoftransaction(int numberoftransaction) {
		this.numberoftransaction = numberoftransaction;
	}
	
	
}
