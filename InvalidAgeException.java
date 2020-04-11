package InterestCalculator;
import java.lang.Exception;
public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super();
		System.out.println("Invalid age. Please enter non-negative age");
	}
}
