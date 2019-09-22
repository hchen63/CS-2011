/* Hua Chen CIN:305942655 
Write a program which asks the user for an integer and then prints the following patterns based on that integer. 

Input Validation:
For Pattern 1, the input must be a value between 1 and 999.
For Pattern 2, the input must be a value between 1 and 26.
Requirements:

For Pattern 1: must be able to work with up to three digit numbers.  You will want to use printf to get the spacing correct.
For Pattern 2: make note of what is uppercase and what is lowercase.
You must use for loops to solve this problem.
Program must be dynamic and work for any of the valid input values.  You CANNOT hardcode the output.
HINT: You will need to use nested loops for this one.  Each pattern is its own set of nested loops.
*/

import java.util.Scanner;

public class HW08P03 {
   public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many rows for Pattern 1?: ");
		int num = in.nextInt();

		char letter = 'A';
		
		while(num < 1 || num > 999){
			System.out.print("How many rows for Pattern 1?: ");
			num = in.nextInt();
		}
			
		
		for(int i = 0; i <= num; i++){
			for(int j = num; j > i; j--){
					System.out.print(j + " ");
				}
			System.out.println();
		}System.out.println("");		

		
		System.out.print("How many rows for Pattern 2?:");
		int data = in.nextInt();
		int c = data;
		
		while(data < 1 || data > 26){
			System.out.print("How many rows for Pattern 2?: ");
			data = in.nextInt();
		}
		
		for(int a = 0; a < data ; a++){
			letter = 'A';
			for(int b = data ; b > a; b--){
				if(b % 2 != 0 && c % 2==0)
					System.out.print(Character.toLowerCase(letter++) + " ");
				else
					System.out.print(letter++ + " ");
					System.out.print(Character.toLowerCase(letter++) + " ");
			}System.out.println();
		}
	}
}
		
		
	

	