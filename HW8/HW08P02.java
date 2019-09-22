/* Hua Chen CIN:305942655 
Write a program to do the following:
Ask the user to enter the total sales for a chain of stores that you own.  
The number of stores will vary for each user input
Display the total sales in a bar graph for each store.
The graph should use asterisks with each asterisk representing $100 of a sale.

Input Validation:
The input must be evenly divisible by 100

Requirements:
The output must match exactly mine.
The graphs must be dynamically generated based on the user input.
You must use for loops to solve the problem you are NOT allowed to use arrays.
HINT: You will need nested loops for this one and will need to think creatively of how to use a string accumulator.
*/

import java.util.Scanner;

public class HW08P02 {
   public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many stores are there?: ");
		int num = in.nextInt();
		int sum = 1;

		System.out.println("GRAPH OF TOTAL SALES");
		System.out.println("Each * = $100");
		
		for(int i = 0; i < num ; i++){
			System.out.print("Enter the total sales for Store " + (i + 1) + ": ");
			double data = in.nextInt();
			System.out.print("Store " + (i + 1) + ": ");
			for(int j = 0; j < data; j += 100){
				while(data / 100 < 1){
					System.out.println();
					System.out.println("Enter the total sales for Store " + (i + 1) + ": ");
					data = in.nextInt();
					System.out.print("Store " + (i + 1) + ": ");
				}
				System.out.print("*");
			}
			sum += i;
			System.out.println();
		}
		
	}
}
	 
