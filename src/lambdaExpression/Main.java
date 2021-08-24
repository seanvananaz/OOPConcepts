package lambdaExpression;

//import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		LambdaFunctionalInterface a = (x,y) -> { return (x + y); };
		System.out.println("Total: " + a.add(5, 16));
		
//		String name = "Chicken Cordon";
//		LambdaFunctionalInterface a = new LambdaFunctionalInterface() {
//			public void message() {
//				System.out.println(name + " Blue");
//			}
//		};
//		a.message();
//		
//		LambdaFunctionalInterface b = () -> System.out.println(name + " Yellow");
//		b.message();
		
//		ArrayList<String> cart = new ArrayList<>();
//		cart.add("Pork Chop");
//		cart.add("Coke");
//		cart.add("Stick");
//		cart.add("Uling");
//		
//// 		traditional for loop
////		for (String item: cart) {
////			System.out.println(item);
////		}
//
//// 		foreach with lambda expression
//		cart.forEach((c) -> System.out.println(c));
	}

}
