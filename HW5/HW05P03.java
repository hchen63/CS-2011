/* Hua Chen CIN:305942655 
Create a menu-driven program that converts a character between its Unicode value and vice versa. 
*/

import java.util.Scanner;

public class HW05P03 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      final String USER_MENU = 
         "1. Convert Character to Unicode\n" + 
         "2. Convert Unicode to Character\n" +
         "3. Exit Program\n" +
         "Enter (1-3) for choice: ";

      final int CHARACTER_UNICODE = 1;
      final int UNICODE_CHARACTER = 2;
      final int EXIT_PROGRAM = 3;  

      System.out.print(USER_MENU);
      int choice = in.nextInt();
	  
		switch(choice) {
         case CHARACTER_UNICODE:
            System.out.print("Enter a character: ");
			String s = in.next();
			char character = s.charAt(0);
			String a = Integer.toHexString(character);
			System.out.println("\\u00" + a);

            break;
         case UNICODE_CHARACTER: 
            System.out.print("Enter a unicode: ");
            int x = in.nextInt();
			char ch = (char)x;
			System.out.println(ch);
            break;
         case EXIT_PROGRAM:
            System.out.println("Program will now exit!");
            System.exit(0);
			break;
         default: 
            System.out.println("ERROR: Menu choice not correct.");
            System.out.println("Program will now exit!");
            System.exit(1);
      }
	}
}