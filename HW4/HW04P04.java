/* Hua Chen CIN:305942655 
A program that tells if a number is a palindrome, a number that reads the same backwards as forwards.
*/

import java.util.Scanner;

public class HW04P04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 8 digit number:");
		int num = input.nextInt();
		int first = num / 10000000;
		int second = (num % 10000000) / 1000000;
		int third = (num % 1000000) / 100000;
		int fourth = (num % 100000) / 10000;
		int fifth  = (num % 10000) / 1000;
		int sixth = (num % 1000) / 100;
		int seventh = (num % 100) / 10;
		int eighth = num % 10;

		if (num > 100000000 || num < 9999999)
			System.out.println("Not 8 digits");
		else if (first == eighth && second == seventh){
			if (third == sixth && fourth == fifth)
				System.out.println("Its is a palindrome");
		}else
			System.out.println("Not a palindrome");
					
	}
}	