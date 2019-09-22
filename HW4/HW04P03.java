/* Hua Chen CIN:305942655 
Present the user a menu and asks them what kind of problem they want to solve.
They can chose from addition, subtraction multiplication or a random problem.
*/

import java.util.Scanner;
import java.util.Random;

public class HW04P03 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      final String USER_MENU = 
         "1. Addition Problem\n" + 
         "2. Subtraction Problem\n" +
         "3. Multiplication Problem\n" +
         "4. Random Problem\n" +
         "Enter (1-4) for choice: ";

      final int ADD_CHOICE = 1;
      final int SUBTRACTION_CHOICE = 2;
      final int MULTIPLICATION_CHOICE = 3;
      final int RANDOM_CHOICE = 4;   

      System.out.print(USER_MENU);
      int choice = in.nextInt();
	  
		Random rand = new Random();
		int randomX = 0 + (int)(Math.random() * ((100 - 0) + 1));
		int randomY = 0 + (int)(Math.random() * ((100 - 0) + 1));

	  
	switch(choice) {
         case ADD_CHOICE:
			System.out.println("x is " + randomX);
			System.out.println("y is " + randomY);
			System.out.println("Solve x + y");
			int num1 = in.nextInt();	
			int sum = randomX + randomY;
			System.out.println("The sum of " + randomX + " + " + randomY + " is " + sum);
			if ( num1 == sum ){ 
				System.out.println("Correct");
			}else 
				System.out.println("Wrong");
			break;
         case SUBTRACTION_CHOICE: 
			System.out.println("x is " + randomX);
			System.out.println("y is " + randomY);
			System.out.println("Solve x - y");
			int num2 = in.nextInt();	
			int difference = randomX - randomY;
			System.out.println("The difference of " + randomX + " - " + randomY + " is " + difference);
			if ( num2 == difference ){ 
				System.out.println("Correct");
			}else 
				System.out.println("Wrong");
            break;
         case MULTIPLICATION_CHOICE:
			System.out.println("x is " + randomX);
			System.out.println("y is " + randomY);
			System.out.println("Solve x * y");
			int num3 = in.nextInt();	
			int product = randomX * randomY;
			System.out.println("The product of " + randomX + " * " + randomY + " is " + product);
			if ( num3 == product ){ 
				System.out.println("Correct");
			}else 
				System.out.println("Wrong");
			
            break;
         case RANDOM_CHOICE:
			int randomChoice = 1 + (int)(Math.random() * ((3 - 1) + 1));
            if (randomChoice == 1) {
				System.out.println("x is " + randomX);
				System.out.println("y is " + randomY);
				System.out.println("Solve x + y");
				int randNum1 = in.nextInt();	
				int randSum = randomX + randomY;
				System.out.println("The sum of " + randomX + " + " + randomY + " is " + randSum);
				if ( randNum1 == randSum ){ 
					System.out.println("Correct");
				}else 
					System.out.println("Wrong");
			}	
			if(randomChoice == 2) {
				System.out.println("x is " + randomX);
				System.out.println("y is " + randomY);
				System.out.println("Solve x - y");
				int randNum2 = in.nextInt();	
				int randDifference = randomX - randomY;
				System.out.println("The difference of " + randomX + " - " + randomY + " is " + randDifference);
				if ( randNum2 == randDifference ){ 
					System.out.println("Correct");
				}else 
					System.out.println("Wrong");
			}
			if(randomChoice == 3) {
				System.out.println("x is " + randomX);
				System.out.println("y is " + randomY);
				System.out.println("Solve x * y");
				int randNum3 = in.nextInt();	
				int randProduct = randomX * randomY;
				System.out.println("The product of " + randomX + " * " + randomY + " is " + randProduct);
				if ( randNum3 == randProduct ){ 
					System.out.println("Correct");
				}else 
					System.out.println("Wrong");
			}
			break;
         default: 
            System.out.println("ERROR: Menu choice not correct.");
            System.out.println("Program will now exit!");
            System.exit(1);
      }
   }
}