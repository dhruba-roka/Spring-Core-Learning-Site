package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("address1")
	private Address address;

	public Address getAddress() {
		return address;
	}

	/*
	 * to call setter method, u have to put @autowired above of the setter methd
	 */
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setter method is called");
	}

	/*
	 * to call constructor, u have to put @autowired above of the constructor
	 */
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("constructor is called");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
