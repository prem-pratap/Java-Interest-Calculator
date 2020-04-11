package InterestCalculator;

public abstract class Account {
	double interestRate;
	double amount;
	abstract double calculateInterest() throws InvalidAmountException, InvalidDaysException, InvalidAgeException, InvalidMonthsException;
}
