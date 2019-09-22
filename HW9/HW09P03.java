/* Hua Chen CIN:305942655
Write a program which takes the grades from ten quizzes and computes the average quiz score.  However, the teacher usually drops the lowest two scores.  You must take this into consideration when computing the average quiz grade.

Your program must implement the following methods:
readQuizScore: This method asks and reads one quiz score from the console, validates the score, and then returns the score.  This method will be called once for each score.
computeAverage: This method takes the ten scores as input, computes the average, and returns the average.
getLowestScore: This method takes the ten scores as input and returns the lowest score of the tens cores.
getSecondLowestScore: This method takes the ten scores as input, and returns the second lowest score of the ten scores.
Display the two lowest scores, and the correct average.

Input Validation:
Each score must be a positive value between 0.0 and 100.0.

Requirements:
All four of the required methods must be implemented, and all must be correctly used within your program to get credit.
Round the solution to two decimal places.
You are only allowed to ask the user to enter the 10 scores once.  
You will need to figure out how to pass the scores to your methods in order to find the solution.
Scores: 100.0 78.45 89.23 98.00 67.87 88.29 82.67 87.50 90.56 94.38
*/

import java.util.Scanner;

public class HW09P03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double data = readQuizScore(in);
		double Lowest = getLowestScore(data, in);
		double SecLowest = getSecondLowestScore(data, Lowest, in);
		double average = computeAverage(data, in);
		
		System.out.println("Two Lowest Scores: " + Lowest + " and " + SecLowest);
		System.out.println("Average: " + average);
	}
	
	public static double readQuizScore(Scanner in) {
		
		System.out.print("Enter the ten scores: ");
		double data = in.nextDouble();
			for(int i = 1; i < 10; i++){
				if(data < 0 || data > 100){
					System.out.print("Enter the ten scores: ");
					data = in.nextDouble();
				}else 
					data = in.nextDouble();
			}return data;
	}			
	
	public static double getLowestScore(double data, Scanner in) {
		double Lowest = data;
		for(int i =1; i <= 10; i++){
			if(data < Lowest)
				Lowest = data;
			data = in.nextDouble();
		}return Lowest;
	}
	
	public static double getSecondLowestScore(double data, double Lowest, Scanner in) {
		double SecLowest = 100;
		for(int i =1; i <= 10; i++){
			if(data < Lowest && data!= Lowest)
				SecLowest = data;
			data = in.nextDouble();
		}return SecLowest;
	}
	
	public static double computeAverage(double data, Scanner in) {
		double sum = 0;
		for(int i =1; i <= 10; i++){
			sum += data;
			data = in.nextDouble();
		}double average = sum / 10;
		return average;
	}
}
