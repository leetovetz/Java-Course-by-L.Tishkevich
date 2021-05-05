package HW003;

public class DepositService {

	public void deposit(Account account, int amount) {
		Bill bill = account.getBill();
		int currentBillAmount = bill.getAmount();
		System.out.println("There is a replenishment operation. Right now the account is " + currentBillAmount);
		bill.setAmount(currentBillAmount + amount);
		System.out.println("The recharge was successful. Current account value = " + bill.getAmount());
	}

}
