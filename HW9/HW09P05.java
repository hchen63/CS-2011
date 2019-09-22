
/*  Hua Chen CIN: 305942655
Write a program which reads a single word and displays all possible substrings of that word.  
You should display the substrings ordered by number of characters.

Input Validation:

None
Requirements:

Your input should be a single word of any number of characters.
The substrings must be listed according to length.
You may not use arrays or any other type of data structure.
Hints:

This program can be solved in less than 30 lines of code (possibly even less than 20).  More than that, and you are probably overthinking your solution.
 */
 import java.util.Scanner;
 
public class HW09P05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = in.nextLine();
		int Length = word.length();
		
		printGrid(word, Length);

	}

	public static void printGrid(String word, int Length){
		String sub;
		for(int i = 0; i <= Length; i++){
			for(int j = 1; j <= Length - i; j++){
				int k = i;
				while (k < Length - j +1){
					sub = word.substring(i+k,j+k);
					System.out.println(sub);
					if(sub.length() == word.length())
						return;
					k++;
				}
			}
		}
	}
}
