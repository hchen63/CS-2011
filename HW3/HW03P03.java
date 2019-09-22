/* Hua Chen CIN:305942655 
Write a program which generates a random number between 1 and 12 [1, 12] 
and displays the English month name corresponding to that number
*/
import java.util.Random;

public class HW03P03 {
	public static void main(String[] args) { 
	Random rand = new Random();
	double randomInt = 1 + (int)(Math.random() * ((12 - 1) + 1));
	System.out.println(randomInt);	
	if (randomInt == 12)
		System.out.println("December");
	else if (randomInt == 11)
		System.out.println("November");
	else if (randomInt == 10)
		System.out.println("October");
	else if (randomInt == 9)
		System.out.println("September");
	else if (randomInt == 8)
		System.out.println("August");
	else if (randomInt == 7)
		System.out.println("July");
	else if (randomInt == 6)
		System.out.println("June");
	else if (randomInt == 5)
		System.out.println("May");
	else if (randomInt == 4)
		System.out.println("April");
	else if (randomInt == 3)
		System.out.println("March");
	else if (randomInt == 2)
		System.out.println("February");
	else
		System.out.println("January");
	}
}