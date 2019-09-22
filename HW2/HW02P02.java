/* Hua Chen CIN:305942655 
calculates the number of slices a pizza of any size can be divided into.
*/

import java.util.Scanner;

// area of a circle of is pi r^2

public class HW02P02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the diameter: ");
		double diameter = input.nextDouble();
		double radius = diameter / 2;
		double area = Math.PI * Math.pow(radius, 2);
		double slice = area / 14.125;
		System.out.println("The diameter of the pizza is: " + diameter);
		System.out.print("A pizza with diameter of " + diameter);
		System.out.print(" can be cut into " + (int)slice);
		System.out.print(" slices.");
	}
}