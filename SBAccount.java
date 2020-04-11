package InterestCalculator;
import java.util.Scanner;
import InterestCalculator.Account.*;
public class  SBAccount extends Account {
	
	Scanner sc=new Scanner(System.in);
	double calculateInterest() throws InvalidAmountException {
		// TODO Auto-generated method stub
		System.out.println("Enter the average amount in your account:");
		this.amount=sc.nextDouble();
		if(amount < 0)
			throw new InvalidAmountException();
		else {
			System.out.println("Select your account type \n1. NRI \n2. Normal");
			int accChoice=sc.nextInt();
			if(accChoice==1) 
				interestRate=0.06;
			else if(accChoice==2)
				interestRate=0.04;
			else
				System.out.println("You have chosen wrong account type");
				
		}
		
		return amount*interestRate;
		
	}
	
	}
