package ninja.mny.budget;

public class Account {
	private String name;
	private Double balance;

	public Account(String name, Double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public Account setName(String name) {
		this.name = name;
		return this;
	}

	public Double getBalance() {
		return balance;
	}

	public Account setBalance(Double balance) {
		this.balance = balance;
		return this;
	}
}
