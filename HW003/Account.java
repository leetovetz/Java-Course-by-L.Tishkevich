package HW003;

public class Account {

	private Person accountHolder;

	private Bill bill;

	public Account(Person accountHolder, Bill bill) {
		this.accountHolder = accountHolder;
		this.bill = bill;
	}

	public Person getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(Person accountHolder) {
		this.accountHolder = accountHolder;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

}
