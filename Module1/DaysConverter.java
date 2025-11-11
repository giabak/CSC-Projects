/**
 * 
 */
package module1;
import java.util.Scanner;
/**
 * Convert total days into years, weeks, and days.
 */
public class DaysConverter {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter total days: ");
		int totalDays = scnr.nextInt();
		
		int years = totalDays/ 365;
		int remainder = totalDays % 365;
		
		int weeks = remainder / 7;
		
		int days= remainder % 7;
		
		System.out.println(years + " years");
		System.out.println(weeks + " weeks");
		System.out.println(days + " days");
		
		scnr.close();
		
		

	}

}
