/* Hua Chen CIN:305942655 
Calculates the wind chill temperature.
*/

import java.util.Scanner;

public class HW02P03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a temperature between -58F and 41F: ");
		double temperature = input.nextDouble();
		System.out.println("Enter a wind speed than is greater than or equal to 2: ");
		double wind = input.nextDouble();
		double windchilltemp = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(wind, 0.16) + 0.4275 * temperature * Math.pow(wind, 0.16);
		System.out.println("Enter a temperature in Fahrenheit between -58F and 41F: " + temperature);
		System.out.println("Enter a wind speed greater than or equal to 2 in miles per hour: " + wind);
		System.out.println("The wind chill temperature " + windchilltemp);
	}
}