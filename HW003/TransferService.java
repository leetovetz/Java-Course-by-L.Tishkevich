package HW003;

public class TransferService {
	
	public void transfer(Account accountFrom, Account accountTo, int amount) {
		int billFromAmount = accountFrom.getBill().getAmount();
		int billToAmount = accountTo.getBill().getAmount();
		if (billFromAmount < amount) {
			System.out.println("No transfer is possible. Not enough funds. ");
		} else {
			System.out.println("There is a transfer of funds. From the account ... " +
				accountFrom.getAccountHolder().getName() + " to the account ... " 
				+ accountTo.getAccountHolder().getName());
			accountFrom.getBill().setAmount(billFromAmount - amount);
			accountTo.getBill().setAmount(billToAmount + amount);
			System.out.println("The transfer is successfully completed. ");
		}
	}
}
