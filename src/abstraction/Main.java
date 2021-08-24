package abstraction;

public class Main {

	public static void main(String[] args) {
		BPIAtm atm1 = new BPIAtm();
		atm1.checkBalance();
		atm1.withdraw(150.00);
		atm1.printReceipt();
		
//		BDOAtm atm2 = new BDOAtm();
//		atm2.checkBalance();
//		atm2.withdraw(500.00f);
//		atm2.printReceipt();
	}

}
