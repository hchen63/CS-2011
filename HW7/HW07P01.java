/* Hua Chen CIN:305942655 
Telephone keypads have an international standard for mapping the alphabet to the number keys.
Write a program which can take a series of 10 letters and converts them to the corresponding phone number.
Using loop
*/

import java.util.Scanner;

public class HW07P01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter input: ");
		String word = in.next();
		double numChars = word.length();
		
		while (numChars != 10){
			System.out.println("Must be 10 characters!");
			word = in.next();
			numChars = word.length();
		}		

		int count = 0;
		do { 
			if (word.charAt(count) == word.charAt(0))
				System.out.print("(");
			if (word.charAt(count) == word.charAt(3))
				System.out.print(")");
			if (word.charAt(count) == word.charAt(6))
				System.out.print("-");
			if (word.charAt(count) >= 'A' && word.charAt(count) <= 'C')
				System.out.print("2");
			if (word.charAt(count) >= 'a' && word.charAt(count) <= 'c')
				System.out.print("2");
			if (word.charAt(count) >= 'D' && word.charAt(count) <= 'F')
				System.out.print("3");
			if (word.charAt(count) >= 'd' && word.charAt(count) <= 'f')
				System.out.print("3");
			if (word.charAt(count) >= 'G' && word.charAt(count) <= 'I')
				System.out.print("4");
			if (word.charAt(count) >= 'g' && word.charAt(count) <= 'i')
				System.out.print("4");
			if (word.charAt(count) >= 'J' && word.charAt(count) <= 'L')
				System.out.print("5");
			if (word.charAt(count) >= 'j' && word.charAt(count) <= 'l')
				System.out.print("5");
			if (word.charAt(count) >= 'M' && word.charAt(count) <= 'O')
				System.out.print("6");
			if (word.charAt(count) >= 'm' && word.charAt(count) <= 'o')
				System.out.print("6");
			if (word.charAt(count) >= 'P' && word.charAt(count) <= 'S')
				System.out.print("7");
			if (word.charAt(count) >= 'p' && word.charAt(count) <= 's')
				System.out.print("7");
			if (word.charAt(count) >= 'T' && word.charAt(count) <= 'V')
				System.out.print("8");
			if (word.charAt(count) >= 't' && word.charAt(count) <= 'v')
				System.out.print("8");
			if (word.charAt(count) >= 'W' && word.charAt(count) <= 'Z')
				System.out.print("9");
			if (word.charAt(count) >= 'w' && word.charAt(count) <= 'z')
				System.out.print("9");
			count++;
		} while (count < 10);
	}
}