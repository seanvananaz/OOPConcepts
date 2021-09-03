package abstraction;

public class Main {

	public static void main(String[] args) {
		BPIAtm atm1 = new BPIAtm();
		System.out.println("Bank 1:");
		atm1.checkBalance();
		atm1.withdraw(150.00);
		atm1.printReceipt();
		System.out.println("\nBank 2:");
		BDOAtm atm2 = new BDOAtm();
		atm2.checkBalance();
		atm2.withdraw(500.00f);
		atm2.printReceipt();
	}

}
