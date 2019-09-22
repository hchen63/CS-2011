
/* Hua Chen CIN: 305942655
Write a program that has a method that displays an n-by-n matrix of random 0s and 1s.
public static void printMatrix(int n)

Input Validation:
The input must be a positive integer.

Requirements:
You must have a method with the following header: public static void printMatrix(int n)
The matrix must be randomly generated every time the program is executed.
 */
import java.util.Scanner;
import java.util.Random;

public class HW09P01 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a value for n: ");
		int n = in.nextInt();
		
		while(n < 0){
			System.out.print("Enter a value for n: ");
			n = in.nextInt();
		}
		
		Random rand = new Random();
		
		printMatrix(n);
	}

	public static void printMatrix(int n) {
		int randomInt = 0 + (int)(Math.random() * ((1 - 0) + 1));
		for (int i = 0; i <= n ; i++) {
			for (int j = 0; j <= n ; j++) {
				System.out.print(randomInt);
				randomInt = 0 + (int)(Math.random() * ((1 - 0) + 1));
			}
			System.out.println();
		}
	}
}

	