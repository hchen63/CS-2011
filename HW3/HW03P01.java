/* Hua Chen CIN:305942655 
reads a floating-­point number and prints "zero" if the number is zero. 
Otherwise, print "positive" or "negative". 
Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
*/

import java.util.Scanner;

public class HW03P01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a floating-point number: ");
		float num = input.nextFloat();
		float Abs = Math.abs(num);
		if (Abs < 1.0000000000000000)
			if (Abs > 0)
			 System.out.println("Small");
		if (num > 0)
			System.out.println("Positive");
		else if (num < 0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
		if (Abs >= 1000000)
			System.out.println("Large");
	}
}