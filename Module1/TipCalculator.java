package module1;

//Asks the user for the bill total
//Asks for the tip percentage they want to leave
//calculates the tip amount the total with tip
/* displays the results clearly and formatted
* to two decimal places*/

import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter your bill total: "); //What is your bill total?
		double bill = scnr.nextDouble(); //billTotal just bill to keep it short
		System.out.print("Enter tip percentage: "); //what tip percentage would you like to leave?
																																																																																	
		double tipPercentage = scnr.nextDouble();
		double tipAmount = bill * tipPercentage / 100; 
		double totalWithTip = bill + tipAmount;
		
		System.out.println();
		System.out.printf("Your total tip amount is: $%.2f%n", tipAmount);	
		System.out.printf("Your total with tip is: $%.2f%n", totalWithTip);
		
				scnr.close();

	}

}
