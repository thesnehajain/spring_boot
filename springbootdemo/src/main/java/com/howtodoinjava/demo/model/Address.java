package com.howtodoinjava.demo.model;


public class Address{

	public Address(){}
	
	public Address(String street, String town, String county, String postCode) {
		this.street = street;
		this.town = town;
		this.county = county;
		this.postcode = postCode;
	}

    private long id;
	
	private String street;
	
	private String town;
	private String county;

	private String postcode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	

}