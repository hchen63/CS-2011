/* Hua Chen CIN:305942655 
calculates distance between the two points.
*/

import java.util.Scanner;

public class HW02P04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x for point 1 = ");
		double x1 = input.nextDouble();
		System.out.println("Enter y for point 1 = ");
		double y1 = input.nextDouble();
		System.out.println("Enter x for point 2 = ");
		double x2 = input.nextDouble();
		System.out.println("Enter y for point 2 = ");
		double y2 = input.nextDouble();
		double x = x2 - x1;
		double y = y2 - y1;
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.print("Point 1: (" + x1);
		System.out.print("," + y1);
		System.out.println(")");
		System.out.print("Point 2: (" + x2);
		System.out.print("," + y2);
		System.out.println(")");
		System.out.println("The distance between points 1 and 2 is: " + distance );
	}
}