/* Hua Chen CIN:305942655 
Write a program that asks the user to enter a number of seconds.
The program will produce the correct number of days, hours, min and seconds corresponding the the input.
*/

/*
60 seconds in a minute
3600 seconds in an hour
86400 seconds in day
*/

import java.util.Scanner;

public class HW03P05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of seconds: ");
		double second = input.nextInt();
		double day = (second / 86400);
		double hour = (((second / 86400) % 1) * 24) ;
		double minute = ((((second / 86400) % 1) * 24) % 1) * 60 ;
		double sec = ((((((second / 86400) % 1) * 24) % 1) * 60) % 1) * 60;
		System.out.println((int)day + " day " + (int)hour + " hour " + (int)minute + " minute " + sec + " seconds");
		
	}
}