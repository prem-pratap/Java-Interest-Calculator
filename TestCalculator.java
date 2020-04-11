package InterestCalculator;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch=0;
		RDAccount rdobj=new RDAccount();
		SBAccount sbobj=new SBAccount();
		FDAccount fdobj=new FDAccount();
		double interestGained;
		do {
			System.out.println("Main Menu\n=========");
			System.out.println("1.Interest Calculator - SB");
			System.out.println("2.Interest Calculator - FD");
			System.out.println("3.Interest Calculator - RD");
			System.out.println("4.Exit");
			System.out.println("Enter your option (1...4):");
			try{ch=sc.nextInt();}
			catch(InputMismatchException ie) {
				System.out.println("Exception Occured as choice value is not integer");}
			try {
			switch (ch) {
			
				case 1:
					interestGained=sbobj.calculateInterest();
					System.out.println("Interest gained is "+interestGained);
					break;
				case 2:
					interestGained=fdobj.calculateInterest();
					System.out.println("Interest gained is "+interestGained);
					break;
				case 3:
					interestGained=rdobj.calculateInterest();
					System.out.println("Interest gained is "+interestGained);
					break;
				default:
					System.out.println("Exiting ...!! Thanks for using the application");
					System.exit(1);
					break;
				}
			}
			catch(InvalidMonthsException me) {
				me.getMessage();}
			catch(InvalidAgeException ae) {
				ae.getMessage();}
			catch(InvalidAmountException am) {
				am.getMessage();}
			catch(InvalidDaysException de) {
				de.getMessage();}
			}while(ch!=4);

	}

}
