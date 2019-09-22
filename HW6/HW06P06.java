/* Hua Chen CIN:305942655 
Write a program which asks for the following information:

the date
the name of the person who the check is for
the amount of the check
Using this information you should display a check formatted exactly like the example.
*/

import java.util.Scanner;

public class HW06P06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the amount of the check?: ");
		String amount = in.next();
		System.out.println("Enter the date of the check: ");
		String date = in.next();
		System.out.println("Who is the check for?: ");
		String person = in.next();
		
		int numChars = amount.length();
		
		int Thousands = Math.abs(numChars - 7);
		char thousand = amount.charAt(Thousands);
		int Hundreds = Math.abs(numChars - 6);
		char hundred = amount.charAt(Hundreds);
		int Tens = Math.abs(numChars - 5);
		char ten = amount.charAt(Tens);
		int Ones = numChars - 4;
		char one = amount.charAt(Ones);
		int poin = numChars - 3;
		char point = amount.charAt(poin);
		int centTenth = numChars - 2;
		char cenTen = amount.charAt(centTenth);
		int centOnes = numChars - 1;
		char cenOne = amount.charAt(centOnes);

		char dot = '.';
	
		final String check =
		"                                                             Date:" + date +
		" \n" + 
		" \n" + 
		"Pay to the Order of: " + person + "              $" + amount ;

		if (numChars >= 8 || numChars <= 2 ){
			System.out.println("Amount can not be higher than 5,000.00 or less than 0.00. Please format with two decimal places!");
			System.exit(0);
		}
			
		if (Thousands != 0)
			thousand = ' ';
		if (Hundreds != 1)
			hundred = ' ';
		if (Tens != 2)
			ten = ' ';
		
		System.out.println(check);
		
		if (thousand == '9')
			System.out.print("nine thousand");
		if (thousand == '8')
			System.out.print("eight thousand");
		if (thousand == '7')
			System.out.print("seven thousand");
		if (thousand == '6')
			System.out.print("six thousand");
		if (thousand == '5')
			System.out.print("five thousand");
		if (thousand == '4')
			System.out.print("four thousand");
		if (thousand == '3')
			System.out.print("three thousand");
		if (thousand == '2')
			System.out.print("two thousand");
		if (thousand == '1')
			System.out.print("one thousand");
		
		if ( hundred == '9')
			System.out.print(" nine hundred");
		if (hundred == '8')
			System.out.print(" eight hundred");
		if (hundred == '7')
			System.out.print(" seven hundred");
		if (hundred == '6')
			System.out.print(" six hundred");
		if (hundred == '5')
			System.out.print(" five hundred");
		if (hundred == '4')
			System.out.print(" four hundred");
		if (hundred == '3')
			System.out.print(" three hundred");
		if (hundred == '2')
			System.out.print(" two hundred");
		if (hundred == '1')
			System.out.print(" one hundred");
		
		if (ten == '9')
			System.out.print(" ninety");
		if (ten == '8')
			System.out.print(" eighty");
		if (ten == '7')
			System.out.print(" seventy");
		if (ten == '6')
			System.out.print(" sixty");
		if (ten == '5')
			System.out.print(" fifty");
		if (ten == '4')
			System.out.print(" forty");
		if (ten == '3')
			System.out.print(" thirty");
		if (ten == '2')
			System.out.print(" twenty");
		if (ten == '1'){
			if (one == '9')
				System.out.print(" nineteen");
			if (one == '8')
				System.out.print(" eighteen");
			if (one == '7')
				System.out.print(" seventeen");
			if (one == '6')
				System.out.print(" sixteen");
			if (one == '5')
				System.out.print(" fifteen");
			if (one == '4')
				System.out.print(" fourteen");
			if (one == '3')
				System.out.print(" thirteen");
			if (one == '2')
				System.out.print(" twelve");
			if (one == '1')
				System.out.print(" eleven");
		}
		if (one == '9' && ten != 1)
			System.out.print(" nine");
		if (one == '8' && ten != 1)
			System.out.print(" eight");
		if (one == '7' && ten != 1)
			System.out.print(" seven");
		if (one == '6' && ten != 1)
			System.out.print(" six");
		if (one == '5' && ten != 1)
			System.out.print(" five");
		if (one == '4' && ten != 1)
			System.out.print(" four");
		if (one == '3' && ten != 1)
			System.out.print(" three");
		if (one == '2' && ten != 1)
			System.out.print(" two");
		if (one == '1' && ten != 1)
			System.out.print(" one");
		if (one == '0' )
			if (thousand == ' ' || hundred == ' ' || ten == ' ')
				System.out.print(" zero");
			
		if (dot == point)
			System.out.print(" and ");
		
		if(cenTen > 0 && cenOne > 0)
			System.out.print(cenTen);
			System.out.print(cenOne);
			System.out.print(" cents");
/*		else if (cenTen == 0)
				System.out.print(cenOne + "cents");
		else
			System.out.print("");
*/	}
}