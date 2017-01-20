package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Customer;
import com.howtodoinjava.demo.model.Employee;

@RestController
public class EmployeeController {
	

	@Autowired
	private JdbcCustomerDAO jdbcCustomerDAO;
	
	


	/**
	 * Get customer using id. Returns HTTP 404 if customer not found
	 * 
	 * @param customerId
	 * @return retrieved customer
	 * @throws Exception 
	 */
	@RequestMapping(value = "/customers/{customerId}", method = RequestMethod.GET)
	public Customer getCustomer(@PathVariable("customerId") Long customerId) throws Exception {
		

    	jdbcCustomerDAO.insert(null);
    	
		/* validate customer Id parameter */
		if (null==customerId) {
			throw new Exception();
		}
		
		Customer customer = jdbcCustomerDAO.findByCustomerId(customerId);
		
		if(null==customer){
			throw new Exception();
		}
		
		return customer;
	}

}
