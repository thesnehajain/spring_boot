package com.howtodoinjava.demo.model;

import java.util.Date;

public class Customer 
{

	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private CustomerImage customerImage;
	private Address address;
	
	
	public Customer(String firstName, String lastName, Date dateOfBirth, CustomerImage customerImage, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.customerImage = customerImage;
		this.address = address;
	}
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public CustomerImage getCustomerImage() {
		return customerImage;
	}
	public void setCustomerImage(CustomerImage customerImage) {
		this.customerImage = customerImage;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", customerImage=" + customerImage + ", address=" + address + "]";
	}
	
		
	
}
