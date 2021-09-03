package inheritance;

public class Cellphone1 extends Cellphone {
	static String ownersName = "mark Senpai's CP";

	public void call() {
		System.out.println("missed call");
	}
	
	public void bluetooth() {
		System.out.println("Connected!");
		super.call();
	}
}
