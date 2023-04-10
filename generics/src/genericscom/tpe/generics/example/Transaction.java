package genericscom.tpe.generics.example;

import java.time.LocalDateTime;

public class Transaction extends BaseClass{
	
	private LocalDateTime time;
	
	private Account account;

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
