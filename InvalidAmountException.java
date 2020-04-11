package InterestCalculator;

class InvalidAmountException extends Exception {
	public InvalidAmountException() {
		super();
		System.out.println("You have entered zero as amount");
	}

}
