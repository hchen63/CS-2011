/* Hua Chen CIN:305942655 
Write a program which reads two Strings of any length from the console.
Display the number of characters in each String
Display whether the first string is a substring of the second
Display whether the second string is a substring of the first.
Display if the two strings are equal or not.
*/

import java.util.Scanner;

public class HW06P01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String s1 = in.next();
		int numChars1 = s1.length();
		System.out.println("Enter the second string: ");
		String s2 = in.next();
		int numChars2 = s2.length();
		System.out.println("\"" + s1 + "\"" + " has " + numChars1 + " characters.");
		System.out.println("\"" + s2 + "\"" + " has " + numChars2 + " characters.");
		
		int equalilty = s1.compareToIgnoreCase(s2);
		
		if (s1.contains(s2)){
			System.out.print("\"" + s1 + "\" is a substring of \"" + s2 + "\"");
			if (s1.startsWith(s2))
				System.out.print(" and appears at the beginning ");
			if (s1.endsWith(s2));
				System.out.println("and end of the string");
		}else
			System.out.println("\"" + s1 + "\" is a not substring of \"" + s2 + "\"");
		
		if (s2.contains(s1)){
			System.out.print("\"" + s2 + "\" is a substring of \"" + s1 + "\"");
			if (s2.startsWith(s1))
				System.out.print(" and appears at the beginning ");
			if (s2.endsWith(s1));
				System.out.println("and end of the string");
		}else
			System.out.println("\"" + s2 + "\" is a not substring of \"" + s1 + "\"");
			
		if (equalilty != 0){
			System.out.print("\"" + s1 + "\" and " + "\"" + s2 + "\" are not equal");
			if (equalilty < 0)
				System.out.print(" and \"" + s1 + "\" is less than \"" + s1 + "\"");
			if (equalilty > 0)
				System.out.print(" and \"" + s1 + "\" is greater than \"" + s1 + "\"");
	    }else
			System.out.println("\"" + s1 + "\" and " + "\"" + s2 + "\" are equal");
	}
}
