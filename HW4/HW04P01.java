/* Hua Chen CIN:305942655 
Write a program that computes taxes based on relationship status tax and amount
*/

import java.util.Scanner;

public class HW04P01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 for single and 2 for married: ");
		double relationship = input.nextDouble();		
		System.out.println("Enter income: ");
		double income = input.nextDouble();
		
		if (relationship == 1){
			if (income > 0 && income < 8000){
				System.out.println("The tax is 10%");
				System.out.println("The amount is " + (income * 0.1) + income);
			}if (income >= 8000 && income < 32000){
				System.out.println("The tax is $800 + 15%");
				System.out.println("The amount is " + ((income + 800) * 0.15) + income);
			}if (income >= 32000 ){
				System.out.println("The tax is $4,400 + 25%");
				System.out.println("The amount is " + ((income + 4400) * 0.25) + income);
			}
		}
		if (relationship == 2){ 
			if (income > 0 && income < 16000){
				System.out.println("The tax is 10%");
				System.out.println("The amount is " + (income * 0.1) + income);
			}if (income >= 16000 && income < 64000){
				System.out.println("The tax is $1,600 + 15%");
				System.out.println("The amount is " + ((income + 1600) * 0.15) + income);
			}if (income >= 64000 ){
				System.out.println("The tax is $8,800 + 25%");
				System.out.println("The amount is " + ((income + 8800) * 0.25) + income);
			}
		}
	}
}