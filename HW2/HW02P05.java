/* Hua Chen CIN:305942655 
reads an integer between 0 and 9999999 and finds the sum of all the digits of the integer
*/

import java.util.Scanner;

public class HW02P05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 9999999 = ");
		int num = input.nextInt();
		int first = num / 1000000;
		int second = (num % 1000000) / 100000;
		int third = (num % 100000) / 10000;
		int fourth = (num % 10000) / 1000;
		int fifth  = (num % 1000) / 100;
		int sixth = (num % 100) / 10;
		int seventh = num % 10;
		int all = first + second + third + fourth + fifth + sixth + seventh;
		System.out.print("The sum of the didgits of " + num);
		System.out.print(" is: " + all);
		
	}
}