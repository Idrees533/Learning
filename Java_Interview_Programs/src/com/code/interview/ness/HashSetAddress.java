package com.code.interview.ness;

import java.util.HashSet;
import java.util.Objects;

class Address {
	private String street;
	private String state;
	private int  pin;
	public Address(String street, String state, int pin) {
		super();
		this.street = street;
		this.state = state;
		this.pin = pin;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + ", pin=" + pin + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(state, street);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return  Objects.equals(state, other.state) && Objects.equals(street, other.street);
	}
	
	
	
}
public class HashSetAddress {
	public static void main(String[] args) {
		
		Address address1=new Address("street1", "state1", 123);
		Address address2=new Address("street2", "state2", 423);
		Address address3=new Address("street1", "state1", 23);
		Address address4=new Address("street3", "state3", 223);
		
		HashSet set=new HashSet();
		set.add(address1);
		set.add(address2);
		set.add(address3);
		set.add(address4);
		
		System.out.println(set);
			
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
