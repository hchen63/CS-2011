/* Hua Chen CIN:305942655 
Write a program that reads a sequence of positive integer inputs until the user enters -1.  
The output should display the following results.  
NOTE: -1 Should NEVER be considered in the calculations.
    • The smallest and largest of all the inputs.
    • The number of even values, and the number of odd values.
*/

import java.util.Scanner;

public class HW07P04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final String intergers =
		"Note: program will not continue unless data entered correctly\n" +
        "Enter positive integers (-1 to finish).\n" ;
		System.out.print(intergers) ;
		int data = in.nextInt();
		int sum = 0;
		int countE = 0;
		int countO = 0;
		int numDat = 0;
		int large = 0;
		int small = data;
		
		do{
			if (data > large)
				large = data;
			else
				small = data;
			if(data % 2 == 0)
				countE++;
			else
				countO++;
			data = in.nextInt();
		}while (data != -1);
		
		System.out.printf("\n%-20s", "Largest Value : " + large);
		System.out.printf("\n%-20s","Smallest Value: " + small);
		System.out.printf("\n%-20s","Total Even Values: " + countE);
		System.out.printf("\n%-20s","Total Odd Values: " + countO);
		
	}
}