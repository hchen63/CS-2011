/* Hua Chen CIN:305942655
Write a program which asks the user to enter the length and width of a rectangle and computes the area.  The program MUST include the following methods:

readLength: This method asks the user for the length of the rectangle, and returns the length.
readWidth: This method asks the user for the width of the rectangle and returns the width.
computeArea: This method takes the length and width as input and returns the computed area of the rectangle.
displaySolution: This method displays the solution to the problem.
You will need to think very carefully about how these methods should work together to find the solution.

Input Validation:

The length must be positive.
The width must be positive.
Requirements:

All four of the required methods must be implemented, and all must be correctly used within your program to get credit.
*/

import java.util.Scanner;

public class HW09P02 {
	public static void main(String[] args) {
		
		int Length = readLength();
		int Width = readWidth();
		int Area = computeArea(Length, Width);
		
		displaySolution(Length, Width, Area);
	}
		
	public static int readLength(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter length: ");
		int Length = in.nextInt();
		while(Length < 0){
			System.out.print("Enter length: ");
			Length = in.nextInt();
		}return Length;
	}
		
	public static int readWidth(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter width: ");
		int Width = in.nextInt();
		while(Width < 0){
			System.out.print("Enter Width: ");
			Width = in.nextInt();
		}return Width;
	}
		
	public static int computeArea(int Length, int Width){
		int Area = Length * Width;
		return Area;
	}
		
	public static void displaySolution(int Length, int Width, int Area){
		System.out.println("The area is " + Area);
	}
}

	