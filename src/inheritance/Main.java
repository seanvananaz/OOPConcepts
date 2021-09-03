package inheritance;

public class Main {

	public static void main(String[] args) {
		Cellphone1 c1 = new Cellphone1();
		Cellphone2 c2 = new Cellphone2();
		
		System.out.println("Cellphone 1:");
		c1.call();
		c1.text();
		c1.bluetooth();
		

		System.out.println("\n\nCellphone 2:");
		c2.rgbOn();
		c2.call();
		System.out.print(c2.lightType);

	}

}
