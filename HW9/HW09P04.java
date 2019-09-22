
/*  Hua Chen CIN: 305942655
 Write a program which asks the user to enter the size of a grid and display the corresponding grid.  The dimensions of the grid will be the same in each dimension, so if the user enters 4, you would display a 4 x 4 grid.  If the user enters 10, you would display a 10 x 10 grid, and so on.  See below for examples.

Input Validation:
The size of the grid must be a positive integer.

Requirements:
You must design your program to use methods correctly.
You must design your program to theoretically work for any input value.

Hints:
You might want to have a method that takes the grid size and prints one line of the grid that has the plus signs: +--+--+--+--+--+
You might want to have a method that takes the grid size and prints one line of the grid that has the vertical pipes: | | | | | |
You might want to have a method that takes the grid size and using the previous two methods, display the correct result.
Choose your return types wisely.
 */
 import java.util.Scanner;
 
public class HW09P04 {

	public static void main(String[] args) {
		int Grid = readGrid();
		printGrid(Grid);

	}
	public static int readGrid(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of the grid: ");
		int Grid = in.nextInt();
		while(Grid < 0){
			System.out.print("Enter the size of the grid: ");
			Grid = in.nextInt();
		}
		return Grid;
	}
	
	public static void printGrid(int Grid){
		for(int a = 0; a <= Grid; a++){
			System.out.print("+");
			for(int i = 1; i <= Grid; i++){
				if (i == Grid)
					System.out.println("--+");
				else
					System.out.print("--+");
			}
			if (a == Grid)
				break;
			System.out.print("|");
			for(int j = 1; j <= Grid; j++){
				if (j == Grid)
					System.out.println("  |");
				else
					System.out.print("  |");
			}
		}
	}
}
