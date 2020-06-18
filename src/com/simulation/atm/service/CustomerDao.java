package com.simulation.atm.service;

import java.util.List;

import com.simulation.atm.model.Customer;

public interface CustomerDao {
	boolean addCustomer(Customer c);
	List<Customer>getAllInfo(String address);
	Customer countCustomer( String address);
	Customer totaltransaction(String address);
	List<Customer>getAllInfo();
}
