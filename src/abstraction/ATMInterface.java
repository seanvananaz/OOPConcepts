package abstraction;

public interface ATMInterface {
	void withdraw(float money); // No need to put abstract in interface because it's already read as abstract
	void checkBalance();
	public void printReceipt();
}

class BDOAtm implements ATMInterface {

	@Override
	public void withdraw(float money) {
		System.out.println("withdrawing: " + money + " ...");
	}

	@Override
	public void checkBalance() {
		System.out.println("Saving account: Php 6,900.00");
	}

	@Override
	public void printReceipt() {
		System.out.println("Account balance: 1000.00");
	}
	
}
