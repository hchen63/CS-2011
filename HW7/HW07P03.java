/* Hua Chen CIN:305942655 
Write a program which reads a String.  
To get full credit your program MUST be able to read an entire string with multiple words, not just the first word of the String. 
Display the following:
    • Only the uppercase letters in the string.
    • The string, with all vowels replaced by an underscore.
    • The number of vowels in the string.
    • The number of consonants in the string
    • The positions (indexes) of all vowels in the string.
*/

import java.util.Scanner;

public class HW07P03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter input: ");
		String word = in.nextLine();
		int numChars = word.length();
		
		int upper = 0;
		int replace = 0;
		int numVow = 0;
		int numCon = 0;
		int countV = 0;
		int countC = 0;
		int pos = 0;
		
		System.out.printf("%-25s","Upper case Letters: ");
		while (upper < numChars){
			char Up = word.charAt(upper);
			if (Character.isUpperCase(Up))
				System.out.print(Up + " ");
			upper++;
		} 

		System.out.printf("\n%-25s","Vowels Replaced: ");
		while (replace < numChars){
			char c = word.charAt(replace);
			if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')
				System.out.print("_");		
			else 
				System.out.print(c);
			replace++;
		} 
		
		System.out.printf("\n%-25s","Number of Vowels: ");
		while (countV < numChars){
			char c = word.charAt(countV);			
			if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')
				numVow++;
			countV++;
		}
		 System.out.print(numVow);
		 
		 System.out.printf("\n%-25s","Number of Consonants: ");
		 while (countC < numChars){
			char c = word.charAt(countC);			
			if (c != 'A' && c != 'a' && c != 'E' && c != 'e' && c != 'I' && c != 'i' && c != 'O' && c != 'o' && c != 'U' && c != 'u' && c != ' ')
				numCon++;
			countC++;
		}
		System.out.print(numCon);
		
		System.out.printf("\n%-25s","Positions of Vowels: ");
		while (pos < numChars){
			char c = word.charAt(pos);
			if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')
				System.out.print(pos + " ");
			pos++;
		} 
	}
}