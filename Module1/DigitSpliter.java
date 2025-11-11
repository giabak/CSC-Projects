/**
 * 
 */
package module1;
import java.util.Scanner;

/**
 * Enter a 4-digit number and print each digit separately.
 */
public class DigitSpliter {

	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter 4 digits: ");
		int digits = scnr.nextInt();
		
		int firstDigit = digits / 1000;
		int remainder = digits % 1000;
		
		int secondDigit = remainder / 100;
		remainder = remainder % 100;
		
		int thirdDigit = remainder / 10;
		remainder = remainder %10;
		
		int fourthDigit = remainder;
		
		System.out.println(firstDigit + " is the first digit");
		System.out.println(secondDigit + " is the second digit");
		System.out.println(thirdDigit + " is the third digit");
		System.out.println(fourthDigit + " is the fourth digit");
		
		scnr.close();
		

	}

}
