package InterestCalculator;
import java.lang.Exception;
public class InvalidMonthsException extends Exception {
	public InvalidMonthsException(String str) {
		super();
		System.out.println(str);
	}
}
