/* Hua Chen CIN:305942655 
Write a program which asks the user for the length of one of the sides (s) of a hexagon 
and computes its area.  Use the following formula:
area=(6s^2)/(4tan(π/6))
*/

import java.util.Scanner;

public class HW05P01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of one of the sides of a hexagon: ");
		double side = input.nextDouble();
		double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
		if (side >= 0)
			System.out.println(area);
		else { 
			System.out.println("Side cannot be negative!");
			System.out.println("Program will now exit!");
            System.exit(0);
		}
	}
}