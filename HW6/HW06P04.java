/* Hua Chen CIN:305942655 
Implement a simple chat interface that accepts slash commands and displays the required output. 
A slash command starts with a forward slash followed by the command i.e. /dance.
*/

import java.util.Scanner;
import java.util.Random;

public class HW06P04 {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = 0 + (int)(Math.random() * ((100 - 0) + 1));
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your character name: ");
		String cmmd = in.next();
		System.out.print("> ");
		String code = in.next();
		String roll = "/roll";
		String dance = "/dance";
		String invite  = "/invite";
		String say  = "/say";
		String party = " ";
		String words = " ";
		int equalRoll = roll.compareTo(code);
		int equalDance = dance.compareTo(code);
		int equalInvite = invite.compareTo(code);
		int equalSay = say.compareTo(code);
		
		if (equalRoll == 0)
			System.out.println(cmmd + " rolled a " + num);
		else if (equalDance == 0)
			System.out.println(cmmd + " rolled a lively dance");
		else if (equalInvite == 0){
			party = in.next();
			System.out.println(party + " has been invite to " + cmmd + "'s party");
		}else if (equalSay == 0){
			words = in.next();
			System.out.println(cmmd + " says: " + words);
		}else
			System.out.println("Unknown command");
		

	}
}