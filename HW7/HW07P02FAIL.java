/* Hua Chen CIN:305942655 
The mean (average) and standard deviation are given in the following formulas.
 Write a program which asks the user for a series of values and computes the mean and standard deviation of those values. 
 Input stops when the user enters "x".
 NOTE: Use the .hasNext<DataType>() functions of Scanner to implement this program.
*/

import java.util.Scanner;

public class HW07P02FAIL {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter values (x to end): ");
		String word = in.nextLine();
		int numChars = word.length();
		char c = word.charAt(numChars - 1);
		int sum = 0;
		int count = 0;
		String data = word.substring(0, numChars - 2);
		String use = " ";

		int num = 0;
		System.out.println("c is " + c);
		System.out.println("Data is" + data);
		int x = count * 2;
		int blank = 0;
		int dataL = data.length();
		
		do{	
			use = data.substring(count, count + 1);
			num = Integer.parseInt(use);
			sum += num;
			System.out.println("Sum: " + sum);
			System.out.println("num is:" + num);
			count = count + 2;
			System.out.println(count);
		}while (count >= dataL);
		
		System.out.printf("\n%-20s", "Average : " + (sum / count));
		System.out.printf("\n%-20s", "Deviation : " + (Math.sqrt(Math.pow(sum - (sum/count), 2) / (count -1))));

		
		
/*		while(in.hasNext()){
			System.out.print(c);
			if (c == 'x'){
				System.out.println("yes");
				System.out.println(word);
			}else
				System.out.println("wrong");
			word = in.nextLine();	
		}
*/		
		
		while (c != 'x'){
			System.out.println("Must end with x");
			word = in.nextLine();
			numChars = word.length();
			c = word.charAt(numChars - 1);
		}	
		System.out.print(word);
/*		while(in.hasNextInt()){
			sum += word;
			word = in.nextInt();
		}
		System.out.print(sum);
		
		
		System.out.print(word.substring(0, numChars));
		while (word != 'x'){
			sum += word;
			count++;
		}
		
*/	}
}