package com.howtodoinjava.demo.controller;

import com.howtodoinjava.demo.model.Customer;

public interface CustomerDAO 
{
	public void insert(Customer customer);
	public Customer findByCustomerId(Long custId);
}




