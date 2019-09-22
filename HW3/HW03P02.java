/* Hua Chen CIN:305942655 
Solve the two roots of a quadratic equation ax2+bx+c=0. 
Find how many root the equation has from the discriminate. 
*/

import java.util.Scanner;

public class HW03P02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the a, b, and c:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double r1 = (- b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		double r2 = (- b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		double root = Math.pow(b, 2) - 4 * a * c;
		
		if (root > 0)
			System.out.println("The equation has two roots " + r1 + " and " + r2 );
		else if (root < 0)
			System.out.println("The equation has no real roots ");
		else
			System.out.println("The equation has one root " + r1);
	}
}