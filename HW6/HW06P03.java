/* Hua Chen CIN:305942655 
A social security number has the form DDD-DD-DDDD where D is a digit.  
You must write a program to determine whether or not a given social security number is valid or not.  
A social security number is valid if it contains all digits in the above format separated by a – in the correct spot.
*/

import java.util.Scanner;

public class HW06P03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a social security number: ");
		String ssn = in.next();
		
		int numChars = ssn.length();		
		if (numChars != 11){
			System.out.println("Must be formated as DDD-DD-DDDD, where D is a digit!");
			System.exit(0);
		}
		
		char ch1 = ssn.charAt(0);
		char ch2 = ssn.charAt(1);
		char ch3 = ssn.charAt(2);
		char ch5 = ssn.charAt(4);
		char ch6 = ssn.charAt(5);
		char ch8 = ssn.charAt(7);
		char ch9 = ssn.charAt(8);
		char ch10 = ssn.charAt(9);
		char ch11 = ssn.charAt(10);	

		char first = ssn.charAt(3);
		char second = ssn.charAt(6);
		char line = '-';
		
		if ((line == first) && (line == second) ){
			if (Character.isDigit(ch1)&& Character.isDigit(ch2) && Character.isDigit(ch3) && Character.isDigit(ch5)&& Character.isDigit(ch6)&& Character.isDigit(ch8) && Character.isDigit(ch9) && Character.isDigit(ch10) && Character.isDigit(ch11))
				System.out.print(ssn + " is a valid number");
			else 
				System.out.print(ssn + " is not a valid number");
		}else
			System.out.print(ssn + " is not a valid number");
		
	}
}
		