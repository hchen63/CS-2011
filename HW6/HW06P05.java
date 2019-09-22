/* Hua Chen CIN:305942655 
Telephone keypads have an international standard for mapping the alphabet to the number keys.
Write a program which can take a series of 10 letters and converts them to the corresponding phone number.
*/

import java.util.Scanner;

public class HW06P05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter input: ");
		String word = in.next();
		int numChars = word.length();
		
		if (numChars != 10){
			System.out.println("Must be 10 characters!");
			System.exit(0);
		}		
		
		char letter = word.charAt(0);
		char letter1 = word.charAt(1);
		char letter2 = word.charAt(2);
		char letter3 = word.charAt(3);
		char letter4 = word.charAt(4);
		char letter5 = word.charAt(5);
		char letter6 = word.charAt(6);
		char letter7 = word.charAt(7);
		char letter8 = word.charAt(8);
		char letter9 = word.charAt(9);

		
		int first = 0;
		int second = 0;
		int third = 0;
		int fourth = 0;
		int fifth = 0;
		int sixth = 0;
		int seventh = 0;
		int eighth = 0;
		int ninth = 0;
		int tenth = 0;
		
		if (letter >= 'A' && letter <= 'C')
			first = 2;
		if (letter >= 'a' && letter <= 'c')
			first = 2;
		if (letter >= 'D' && letter <= 'F')
			first = 3;
		if (letter >= 'd' && letter <= 'f')
			first = 3;
		if (letter >= 'G' && letter <= 'I')
			first = 4;
		if (letter >= 'g' && letter <= 'i')
			first = 4;
		if (letter >= 'J' && letter <= 'L')
			first = 5;
		if (letter >= 'j' && letter <= 'l')
			first = 5;
		if (letter >= 'M' && letter <= 'O')
			first = 6;
		if (letter >= 'm' && letter <= 'o')
			first = 6;
		if (letter >= 'P' && letter <= 'S')
			first = 7;
		if (letter >= 'p' && letter <= 's')
			first = 7;
		if (letter >= 'T' && letter <= 'V')
			first = 8;
		if (letter >= 't' && letter <= 'v')
			first = 8;
		if (letter >= 'W' && letter <= 'Z')
			first = 9;
		if (letter >= 'w' && letter <= 'z')
			first = 9;
		
		if (letter1 >= 'A' && letter1 <= 'C')
			second = 2;
		if (letter1 >= 'a' && letter1 <= 'c')
			second = 2;
		if (letter1 >= 'D' && letter1 <= 'F')
			second = 3;
		if (letter1 >= 'd' && letter1 <= 'f')
			second = 3;
		if (letter1 >= 'G' && letter1 <= 'I')
			second = 4;
		if (letter1 >= 'g' && letter1 <= 'i')
			second = 4;
		if (letter1 >= 'J' && letter1 <= 'L')
			second = 5;
		if (letter1 >= 'j' && letter1 <= 'l')
			second = 5;
		if (letter1 >= 'M' && letter1 <= 'O')
			second = 6;
		if (letter1 >= 'm' && letter1 <= 'o')
			second = 6;
		if (letter1 >= 'P' && letter1 <= 'S')
			second = 7;
		if (letter1 >= 'p' && letter1 <= 's')
			second = 7;
		if (letter1 >= 'T' && letter1 <= 'V')
			second = 8;
		if (letter1 >= 't' && letter1 <= 'v')
			second = 8;
		if (letter1 >= 'W' && letter1 <= 'Z')
			second = 9;
		if (letter1 >= 'w' && letter1 <= 'z')
			second = 9;
		
		if (letter2 >= 'A' && letter2 <= 'C')
			third = 2;
		if (letter2 >= 'a' && letter2 <= 'c')
			third = 2;
		if (letter2 >= 'D' && letter2 <= 'F')
			third = 3;
		if (letter2 >= 'd' && letter2 <= 'f')
			third = 3;
		if (letter2 >= 'G' && letter2 <= 'I')
			third = 4;
		if (letter2 >= 'g' && letter2 <= 'i')
			third = 4;
		if (letter2 >= 'J' && letter2 <= 'L')
			third = 5;
		if (letter2 >= 'j' && letter2 <= 'l')
			third = 5;
		if (letter2 >= 'M' && letter2 <= 'O')
			third = 6;
		if (letter2 >= 'm' && letter2 <= 'o')
			third = 6;
		if (letter2 >= 'P' && letter2 <= 'S')
			third = 7;
		if (letter2 >= 'p' && letter2 <= 's')
			third = 7;
		if (letter2 >= 'T' && letter2 <= 'V')
			third = 8;
		if (letter2 >= 't' && letter2 <= 'v')
			third = 8;
		if (letter2 >= 'W' && letter2 <= 'Z')
			third = 9;
		if (letter2 >= 'w' && letter2 <= 'z')
			third = 9;
		
		if (letter3 >= 'A' && letter3 <= 'C')
			fourth = 2;
		if (letter3 >= 'a' && letter3 <= 'c')
			fourth = 2;
		if (letter3 >= 'D' && letter3 <= 'F')
			fourth = 3;
		if (letter3 >= 'd' && letter3 <= 'f')
			fourth = 3;
		if (letter3 >= 'G' && letter3 <= 'I')
			fourth = 4;
		if (letter3 >= 'g' && letter3 <= 'i')
			fourth = 4;
		if (letter3 >= 'J' && letter3 <= 'L')
			fourth = 5;
		if (letter3 >= 'j' && letter3 <= 'l')
			fourth = 5;
		if (letter3 >= 'M' && letter3 <= 'O')
			fourth = 6;
		if (letter3 >= 'm' && letter3 <= 'o')
			fourth = 6;
		if (letter3 >= 'P' && letter3 <= 'S')
			fourth = 7;
		if (letter3 >= 'p' && letter3 <= 's')
			fourth = 7;
		if (letter3 >= 'T' && letter3 <= 'V')
			fourth = 8;
		if (letter3 >= 't' && letter3 <= 'v')
			fourth = 8;
		if (letter3 >= 'W' && letter3 <= 'Z')
			fourth = 9;
		if (letter3 >= 'w' && letter3 <= 'z')
			fourth = 9;
		
		if (letter4 >= 'A' && letter4 <= 'C')
			fifth = 2;
		if (letter4 >= 'a' && letter4 <= 'c')
			fifth = 2;
		if (letter4 >= 'D' && letter4 <= 'F')
			fifth = 3;
		if (letter4 >= 'd' && letter4 <= 'f')
			fifth = 3;
		if (letter4 >= 'G' && letter4 <= 'I')
			fifth = 4;
		if (letter4 >= 'g' && letter4 <= 'i')
			fifth = 4;
		if (letter4 >= 'J' && letter4 <= 'L')
			fifth = 5;
		if (letter4 >= 'j' && letter4 <= 'l')
			fifth = 5;
		if (letter4 >= 'M' && letter4 <= 'O')
			fifth = 6;
		if (letter4 >= 'm' && letter4 <= 'o')
			fifth = 6;
		if (letter4 >= 'P' && letter4 <= 'S')
			fifth = 7;
		if (letter4 >= 'p' && letter4 <= 's')
			fifth = 7;
		if (letter4 >= 'T' && letter4 <= 'V')
			fifth = 8;
		if (letter4 >= 't' && letter4 <= 'v')
			fifth = 8;
		if (letter4 >= 'W' && letter4 <= 'Z')
			fifth = 9;
		if (letter4 >= 'w' && letter4 <= 'z')
			fifth = 9;
		
		if (letter5 >= 'A' && letter5 <= 'C')
			sixth = 2;
		if (letter5 >= 'a' && letter5 <= 'c')
			sixth = 2;
		if (letter5 >= 'D' && letter5 <= 'F')
			sixth = 3;
		if (letter5 >= 'd' && letter5 <= 'f')
			sixth = 3;
		if (letter5 >= 'G' && letter5 <= 'I')
			sixth = 4;
		if (letter5 >= 'g' && letter5 <= 'i')
			sixth = 4;
		if (letter5 >= 'J' && letter5 <= 'L')
			sixth = 5;
		if (letter5 >= 'j' && letter5 <= 'l')
			sixth = 5;
		if (letter5 >= 'M' && letter5 <= 'O')
			sixth = 6;
		if (letter5 >= 'm' && letter5 <= 'o')
			sixth = 6;
		if (letter5 >= 'P' && letter5 <= 'S')
			sixth = 7;
		if (letter5 >= 'p' && letter5 <= 's')
			sixth = 7;
		if (letter5 >= 'T' && letter5 <= 'V')
			sixth = 8;
		if (letter5 >= 't' && letter5 <= 'v')
			sixth = 8;
		if (letter5 >= 'W' && letter5 <= 'Z')
			sixth = 9;
		if (letter5 >= 'w' && letter5 <= 'z')
			sixth = 9;
		
		if (letter6 >= 'A' && letter6 <= 'C')
			seventh = 2;
		if (letter6 >= 'a' && letter6 <= 'c')
			seventh = 2;
		if (letter6 >= 'D' && letter6 <= 'F')
			seventh = 3;
		if (letter6 >= 'd' && letter6 <= 'f')
			seventh = 3;
		if (letter6 >= 'G' && letter6 <= 'I')
			seventh = 4;
		if (letter6 >= 'g' && letter6 <= 'i')
			seventh = 4;
		if (letter6 >= 'J' && letter6 <= 'L')
			seventh = 5;
		if (letter6 >= 'j' && letter6 <= 'l')
			seventh = 5;
		if (letter6 >= 'M' && letter6 <= 'O')
			seventh = 6;
		if (letter6 >= 'm' && letter6 <= 'o')
			seventh = 6;
		if (letter6 >= 'P' && letter6 <= 'S')
			seventh = 7;
		if (letter6 >= 'p' && letter6 <= 's')
			seventh = 7;
		if (letter6 >= 'T' && letter6 <= 'V')
			seventh = 8;
		if (letter6 >= 't' && letter6 <= 'v')
			seventh = 8;
		if (letter6 >= 'W' && letter6 <= 'Z')
			seventh = 9;
		if (letter6 >= 'w' && letter6 <= 'z')
			seventh = 9;
		
		if (letter7 >= 'A' && letter7 <= 'C')
			eighth = 2;
		if (letter7 >= 'a' && letter7 <= 'c')
			eighth = 2;
		if (letter7 >= 'D' && letter7 <= 'F')
			eighth = 3;
		if (letter7 >= 'd' && letter7 <= 'f')
			eighth = 3;
		if (letter7 >= 'G' && letter7 <= 'I')
			eighth = 4;
		if (letter7 >= 'g' && letter7 <= 'i')
			eighth = 4;
		if (letter7 >= 'J' && letter7 <= 'L')
			eighth = 5;
		if (letter7 >= 'j' && letter7 <= 'l')
			eighth = 5;
		if (letter7 >= 'M' && letter7 <= 'O')
			eighth = 6;
		if (letter7 >= 'm' && letter7 <= 'o')
			eighth = 6;
		if (letter7 >= 'P' && letter7 <= 'S')
			eighth = 7;
		if (letter7 >= 'p' && letter7 <= 's')
			eighth = 7;
		if (letter7 >= 'T' && letter7 <= 'V')
			eighth = 8;
		if (letter7 >= 't' && letter7 <= 'v')
			eighth = 8;
		if (letter7 >= 'W' && letter7 <= 'Z')
			eighth = 9;
		if (letter7 >= 'w' && letter7 <= 'z')
			eighth = 9;
		
		if (letter8 >= 'A' && letter8 <= 'C')
			ninth = 2;
		if (letter8 >= 'a' && letter8 <= 'c')
			ninth = 2;
		if (letter8 >= 'D' && letter8 <= 'F')
			ninth = 3;
		if (letter8 >= 'd' && letter8 <= 'f')
			ninth = 3;
		if (letter8 >= 'G' && letter8 <= 'I')
			ninth = 4;
		if (letter8 >= 'g' && letter8 <= 'i')
			ninth = 4;
		if (letter8 >= 'J' && letter8 <= 'L')
			ninth = 5;
		if (letter8 >= 'j' && letter8 <= 'l')
			ninth = 5;
		if (letter8 >= 'M' && letter8 <= 'O')
			ninth = 6;
		if (letter8 >= 'm' && letter8 <= 'o')
			ninth = 6;
		if (letter8 >= 'P' && letter8 <= 'S')
			ninth = 7;
		if (letter8 >= 'p' && letter8 <= 's')
			ninth = 7;
		if (letter8 >= 'T' && letter8 <= 'V')
			ninth = 8;
		if (letter8 >= 't' && letter8 <= 'v')
			ninth = 8;
		if (letter8 >= 'W' && letter8 <= 'Z')
			ninth = 9;
		if (letter8 >= 'w' && letter8 <= 'z')
			ninth = 9;
		
		if (letter9 >= 'A' && letter9 <= 'C')
			tenth = 2;
		if (letter9 >= 'a' && letter9 <= 'c')
			tenth = 2;
		if (letter9 >= 'D' && letter9 <= 'F')
			tenth = 3;
		if (letter9 >= 'd' && letter9 <= 'f')
			tenth = 3;
		if (letter9 >= 'G' && letter9 <= 'I')
			tenth = 4;
		if (letter9 >= 'g' && letter9 <= 'i')
			tenth = 4;
		if (letter9 >= 'J' && letter9 <= 'L')
			tenth = 5;
		if (letter9 >= 'j' && letter9 <= 'l')
			tenth = 5;
		if (letter9 >= 'M' && letter9 <= 'O')
			tenth = 6;
		if (letter9 >= 'm' && letter9 <= 'o')
			tenth = 6;
		if (letter9 >= 'P' && letter9 <= 'S')
			tenth = 7;
		if (letter9 >= 'p' && letter9 <= 's')
			tenth = 7;
		if (letter9 >= 'T' && letter9 <= 'V')
			tenth = 8;
		if (letter9 >= 't' && letter9 <= 'v')
			tenth = 8;
		if (letter9 >= 'W' && letter9 <= 'Z')
			tenth = 9;
		if (letter9 >= 'w' && letter9 <= 'z')
			tenth = 9;
		
		if (numChars == 10)
			System.out.println("(" + first + second + third + ") " + fourth + fifth + sixth + "-" + seventh + eighth + ninth + tenth);

	}
}