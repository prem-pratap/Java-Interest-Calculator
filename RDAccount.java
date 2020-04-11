package InterestCalculator;
import java.util.Scanner;
public class RDAccount extends Account {
	int noOfMonths;
	double monthlyAmount;
	double general,sCitizen;
	int ageOfACHolder;
	Scanner sc=new Scanner(System.in);
	
	double calculateInterest() throws InvalidAgeException,InvalidAmountException,InvalidMonthsException{
		
		System.out.println("Enter the monthly deposit amount: ");
		monthlyAmount=sc.nextDouble();
		System.out.println("Enter the number of months:");
		noOfMonths=sc.nextInt();
		System.out.println("Enter your age:");
		ageOfACHolder=sc.nextInt();
		if(amount < 0)
			throw new InvalidAmountException();
		if(noOfMonths < 0)
			throw new InvalidMonthsException("Invalid Number of months. Please enter non-negative values");
		if(noOfMonths<6)
			throw new InvalidMonthsException("Invalid Number of months. Please enter no. of months greater than 6");
		if(ageOfACHolder <0)
			throw new InvalidAgeException();
		if (noOfMonths >= 0 && noOfMonths <= 6) {
            general = .0750;
            sCitizen = 0.080;
        } else if (noOfMonths >= 7 && noOfMonths <= 9) {
            general = .0775;
            sCitizen = 0.0825;
        } else if (noOfMonths >= 10 && noOfMonths <= 12) {
            general = .0800;
            sCitizen = 0.0850;
        } else if (noOfMonths >= 13 && noOfMonths <= 15) {
            general = .0825;
            sCitizen = 0.0875;
        } else if (noOfMonths >= 16 && noOfMonths <= 18) {
            general = .0850;
            sCitizen = 0.0900;
        } else if (noOfMonths >= 22) { 
            general = .0875;
            sCitizen = 0.0925;}
		interestRate = (ageOfACHolder < 50) ? general : sCitizen;
        return monthlyAmount * interestRate;
		
	}

}
