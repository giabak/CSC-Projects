/**
 * 
 */
package module1;
import java.util.Scanner;
/**
 * Write a program that takes a dollar-and-cent amount (like $1.37)
 *  and tells the user how many quarters, dimes, nickels, and pennies make up that amount.
 */
public class ChangeMaker {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter the amount of change: ");
		int amountOfChange = scnr.nextInt();
		
		int quarters = amountOfChange / 25;
		int remainder = amountOfChange%25;
		
		int dimes = remainder/10;
		remainder = remainder%10;
		
		int nickels = remainder/5;
		remainder = remainder%5;
		
		int pennies = remainder;
		
		System.out.println(quarters + " Quarters");
		System.out.println(dimes + " Dimes");
		System.out.println(nickels + " Nickels");
		System.out.println(pennies + " Pennies");
		
		scnr.close();

	}

}
