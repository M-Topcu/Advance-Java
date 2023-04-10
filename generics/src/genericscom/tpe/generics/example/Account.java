package genericscom.tpe.generics.example;

public class Account extends BaseClass{
	
	private Long accountNumber;
	
	private Double balance;

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

}
