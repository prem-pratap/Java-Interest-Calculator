package InterestCalculator;
import java.util.Scanner;

public class FDAccount extends Account {
	int noOfDays;
	int ageOfACHolder;
	double general,sCitizen;
	Scanner sc=new Scanner(System.in);
	@Override
	double calculateInterest() throws InvalidAgeException,InvalidAmountException,InvalidDaysException{
		
		System.out.println("Enter the FD amount: ");
		this.amount=sc.nextDouble();
		System.out.println("Enter the number of days:");
		noOfDays=sc.nextInt();
		System.out.println("Enter your age:");
		ageOfACHolder=sc.nextInt();
		if(amount < 0)
			throw new InvalidAmountException();
		if(noOfDays < 0)
			throw new InvalidDaysException("Invalid Number of days. Please enter non-negative values");
		if(noOfDays<7)
			throw new InvalidDaysException("Invalid Number of days. Please enter no. of days greater than 7");
		if(ageOfACHolder <0)
			throw new InvalidAgeException();
		if (amount < 10000000) {
            if (noOfDays >= 7 && noOfDays <= 14) {
                general = 0.0450;
                sCitizen = 0.0500;
            } else if (noOfDays >= 15 && noOfDays <= 29) {
                general = 0.0475;
                sCitizen = 0.0525;
            } else if (noOfDays >= 30 && noOfDays <= 45) {
                general = 0.0550;
                sCitizen = 0.0600;
            } else if (noOfDays >= 45 && noOfDays <= 60) {
                general = 0.0700;
                sCitizen = 0.0750;
            } else if (noOfDays >= 61 && noOfDays <= 184) {
                general = 0.0750;
                sCitizen = 0.0800;
            } else if (noOfDays >= 185 && noOfDays <= 365) {
                general = 0.0800;
                sCitizen = 0.0850;
            }
            interestRate = (ageOfACHolder < 50) ? general : sCitizen;
		}
		else {
			if (noOfDays >= 7 && noOfDays <= 14) 
                interestRate = 0.065;
             else if (noOfDays >= 15 && noOfDays <= 29) 
                interestRate = 0.0675;
             else if (noOfDays >= 30 && noOfDays <= 45) 
                interestRate = 0.0675;
             else if (noOfDays >= 45 && noOfDays <= 60) 
                interestRate = 0.080;
             else if (noOfDays >= 61 && noOfDays <= 184) 
                interestRate = 0.0850;
             else if (noOfDays >= 185 && noOfDays <= 365) 
                interestRate = 0.10;
		}
		
		return amount*interestRate;
	}

}
