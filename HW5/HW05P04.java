/* Hua Chen CIN:305942655 
Write a program that has the user enter a character and displays some information about the character based on the following rules:

Say whether or not the character is a letter, digit, or non-alphanumeric.
If the character is a letter, say whether or not it is uppercase or lowercase
*/

import java.util.Scanner;

public class HW05P04 {
   public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String s = in.next();
		char character = s.charAt(0);

		if (Character.isLetter(character))
			System.out.println("Letter");
			if(Character.isUpperCase(character))
				System.out.println("Upper case");
			if (Character.isLowerCase(character))
				System.out.println("Lower case");
		else if (Character.isDigit(character))
			System.out.println("Digit");
		else 
			System.out.println("non-aplhanumeric");
  
 
   }
}