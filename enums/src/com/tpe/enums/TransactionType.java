package com.tpe.enums;

public enum TransactionType {

	DEPOSIT(5),
	WITHDRAW(10),
	TRANSFER(15),
	PAYMENT(20),
	OTHER(100);
	
	private final int transactionCode;
	
	private TransactionType(int code) {
		this.transactionCode=code;
	}

	public int getTransactionCode() {
		return transactionCode;
	}
	
	//Hibernate mapping yaparken @Enumerated(EnumType.STRING) kullanmazsak ordinal value`u map eder ismi degil
}
