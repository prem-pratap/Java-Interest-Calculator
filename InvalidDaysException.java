package InterestCalculator;
import java.lang.Exception;
public class InvalidDaysException extends Exception {
	public InvalidDaysException(String str) {
		super();
		System.out.println(str);
	}
}
