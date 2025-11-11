/**
 * 
 */
package module1;
import java.util.Scanner;
/**
 * Write a program that takes total seconds and converts it to hours, minutes, and seconds.
 */
public class SecondsConverter {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter total seconds: ");
		int totalSeconds = scnr.nextInt();
		
		int hours = totalSeconds / 3600; //60*60 there is 3600 seconds in a hour
		int remainder = totalSeconds % 3600;
		
		int minutes = remainder / 60;
		remainder = remainder % 60;
		
		int seconds = remainder;
		
		System.out.println(hours + " hours");
		System.out.println(minutes + " minutes");
		System.out.println(seconds + " seconds");
		
		scnr.close();
		

	}

}
