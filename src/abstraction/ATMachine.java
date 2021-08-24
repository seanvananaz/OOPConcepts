package abstraction;

public abstract class ATMachine {
	abstract void withdraw(double money);
	abstract void checkBalance();
	
	public void printReceipt() {
		System.out.println("Account balance: -150.00");
	}
}

class BPIAtm extends ATMachine {

	@Override
	public void withdraw(double money) {
		System.out.println("withdrawing: " + money + " ...");
	}

	@Override
	void checkBalance() {
		System.out.println("Saving account: Php 1,500.00");
	}

}