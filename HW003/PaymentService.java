package HW003;

public class PaymentService {

	public void pay (Account account, int amount) {
		Bill bill = account.getBill();
		if (bill.getAmount() < amount) {
			System.out.println("No payment possible. Insufficient funds. ");
		} else {
			int currentBillAmount = bill.getAmount();
			System.out.println("The current value of the account: " + currentBillAmount);
			bill.setAmount(currentBillAmount - amount);
			System.out.println("The new meaning of the account: " + bill.getAmount());
		}

	}

}
