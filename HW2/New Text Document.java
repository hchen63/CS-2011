import java.util.Scanner;

//sales tax = 9%

public class HW02P01 {
	public static void main(String[] args) {
		int product1 = 5.00
		int product2 = 6.99
		int product3 = 20.87
		int product4 = 203.55
		int product5 = 45.98
		int subtotal = product1 + product2 + product3 + product4 + product5
		int tax = subtotal * 0.09
		int done = tax + subtotal
		System.out.println("Subtotal:" + subtotal);
		System.out.println("Sales Tax:" + tax);
		System.out.println("Total:" + done);
	}
}