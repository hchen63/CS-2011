/* Hua Chen CIN:305942655 
A customer in a store is purchasing five items. 
Includes sales tax and total.
*/

import java.util.Scanner;

//sales tax = 9%

public class HW02P01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the cost of product 1: ");
		double product1 = input.nextDouble();
		System.out.println("Enter the cost of product 2: ");
		double product2 = input.nextDouble();
		System.out.println("Enter the cost of product 3: ");
		double product3 = input.nextDouble();
		System.out.println("Enter the cost of product 4: ");
		double product4 = input.nextDouble();
		System.out.println("Enter the cost of product 5: ");
		double product5 = input.nextDouble();
		double subtotal = product1 + product2 + product3 + product4 + product5;
		double tax = subtotal * 0.09;
		double done = tax + subtotal;
		System.out.println("The cost of product 1 is $" + product1);
		System.out.println("The cost of product 2 is $" + product2);
		System.out.println("The cost of product 3 is $" + product3);
		System.out.println("The cost of product 4 is $" + product4);
		System.out.println("The cost of product 5 is $" + product5);
		System.out.println("");
		System.out.println("Subtotal:  $" + subtotal);
		System.out.println("Sales Tax: $" + tax);
		System.out.println("Total:     $" + done);
	}
}