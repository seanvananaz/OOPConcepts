package exceptionHandling;

public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super("\n" + "Invalid Age, you should be 18+ to sign up.");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
}
