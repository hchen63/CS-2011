/* Hua Chen CIN:305942655 
Write a program that plays Rock, Paper, Scissors. 
*/

import java.util.Scanner;
import java.util.Random;

public class HW04P02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 0 for rock, 1 for paper or 2 for scissors: ");
		double num = input.nextDouble();	
		Random rand = new Random();
		double randomInt = 0 + (int)(Math.random() * ((2 - 0) + 1));
		
		if (num == 0)
			System.out.println("You chose rock");
		if (num == 1)
			System.out.println("You chose paper");
		if (num == 2)
			System.out.println("You chose scissors");
		
		if (randomInt == 0)
			System.out.println("The computer chose rock");
		if (randomInt == 1)
			System.out.println("The computer chose paper");
		if (randomInt == 2)
			System.out.println("The computer chose scissors");
		
		if (num == 0){
			if (randomInt == 0)
				System.out.println("draw");
			if (randomInt == 1)
				System.out.println("you lose");
			if (randomInt == 2)
				System.out.println("you win");
		}
		if (num == 1){
			if (randomInt == 0)
				System.out.println("you win");
			if (randomInt == 1)
				System.out.println("draw");
			if (randomInt == 2)
				System.out.println("you lose");
		}
		if (num == 2){
			if(randomInt == 0)
				System.out.println("you lose");
			if (randomInt == 1)
				System.out.println("you win");
			if (randomInt == 2)
				System.out.println("draw");
		}
	}
}