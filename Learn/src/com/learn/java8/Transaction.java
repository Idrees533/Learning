package com.learn.java8;

public class Transaction {

	private String type;
    private double amount;
    
	
    public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Transaction(String type, double amount) {
		super();
		this.type = type;
		this.amount = amount;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Transaction [type=" + type + ", amount=" + amount + "]";
	}  
		
    
}
