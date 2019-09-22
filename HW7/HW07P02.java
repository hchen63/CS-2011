/* Hua Chen CIN:305942655 
The mean (average) and standard deviation are given in the following formulas.
 Write a program which asks the user for a series of values and computes the mean and standard deviation of those values. 
 Input stops when the user enters "x".
 NOTE: Use the .hasNext<DataType>() functions of Scanner to implement this program.
*/

import java.util.Scanner;

public class HW07P02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final String intergers =
		"Note: program will not continue unless data entered correctly\n" +
        "Enter values (x to end): \n" ;
		System.out.print(intergers) ;
		
		double data = in.nextDouble();
		
		double sum = 0;
		double count = 0;
		double SD = 0;

		while(in.hasNextDouble()){
			if(in.equals("x"))
				break;
			count++;
			sum += data;
			SD += Math.pow(data - (sum/count), 2);
			data = in.nextDouble();
		}

		
		
		double avg = sum / count;	
		
/*		while(in.hasNextDouble()){
			System.out.println("SD: " + data);
			if(in.equals("x"))
				break;
			data = in.nextDouble();
			SD += Math.pow(data - avg, 2);

		}
		
*/		System.out.printf("\n%-20s","Average: " + avg);
		System.out.printf("\n%-20s", "Deviation : " + (Math.sqrt(SD  / (count - 1))));
	}
}	
