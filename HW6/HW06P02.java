/* Hua Chen CIN:305942655 
A license plate is made up of three uppercase letters followed by four digits. 
Write a program which will randomly generate a license plate number based on the given criteria.
*/

import java.util.Random;

public class HW06P02 {
	public static void main(String[] args) {
		Random rand = new Random();
		int num1 = 0 + (int)(Math.random() * ((9 - 0) + 1));
		int num2 = 0 + (int)(Math.random() * ((9 - 0) + 1));
		int num3 = 0 + (int)(Math.random() * ((9 - 0) + 1));
		int num4 = 0 + (int)(Math.random() * ((9 - 0) + 1));
		
		int letter1 = 65 + (int)(Math.random() * ((90 - 65) + 1));	
		char ch1 = (char)letter1;

		int letter2 = 65 + (int)(Math.random() * ((90 - 65) + 1));
		char ch2 = (char)letter2;
		
		int letter3 = 65 + (int)(Math.random() * ((90 - 65) + 1));	
		char ch3 = (char)letter3;
		
		System.out.println("Your license plate number is: " + ch1 + ch2 + ch3 + (int)num1 + (int)num2 + (int)num3 + (int)num4);
	}
}