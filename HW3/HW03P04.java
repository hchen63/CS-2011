/* Hua Chen CIN:305942655 
Write a program that prompts the user to enter an integer for today’s day of the week
prompt the user to enter the number of days after today for a today day and display the today day of the week.
*/

import java.util.Scanner;

public class HW03P04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day: ");
		int today = input.nextInt();
		System.out.println("Enter the number of days elapsed since today: ");
		int future = input.nextInt();
		int elapsed = (future + today) % 7;
		
		System.out.print("Today is ");
		switch (today)
		{
			case 0: System.out.print("Sunday"); break;
			case 1: System.out.print("Monday"); break;
			case 2: System.out.print("Tuesday"); break;
			case 3: System.out.print("Wednesday"); break;
			case 4: System.out.print("Thursday"); break;
			case 5: System.out.print("Friday"); break;
			case 6: System.out.print("Saturday");
		}

		System.out.print(" and the future day is ");
		switch (elapsed)
		{
			case 0: System.out.println("Sunday"); break;
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Saturday");
		}
    }
}