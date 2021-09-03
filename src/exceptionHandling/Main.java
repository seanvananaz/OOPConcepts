package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter you age: ");
			int age = scan.nextInt();
			checkAge(age);
		} catch (InvalidAgeException e) {
			System.out.println("Custom Excetion: " + e);
		} catch(InputMismatchException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally here!");
		}
		
		scan.close();
		System.out.println("End of program.");
	}
	
	static void checkAge(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException();
		} else {
			System.out.println("Sign up successful!");
		}
	}
}

//	if(age < 18) {
//	throw new InvalidAgeException();
//}

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int [] nums = new int[5];
//		
//		try {
//			System.out.println("in Try");
//			nums[11] = 6;
//		} catch (Exception ex) {
//			System.out.println("in Catch: " + ex);
//			return;
//		} finally {
//			System.out.println("Finally block");
//		}
//		
//		System.out.println("Rest of the code");
//	}

