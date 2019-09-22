/* Hua Chen CIN:305942655 
Write a program that will print the ASCII characters from ! to ~ as a table. 
No input validation required, no input required.
*/

public class HW08P01 {
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 33 ; i < 127 ; i++){
			count++;
 //         int x = in.nextInt();
			char ch = (char)i;
			System.out.print(ch);
			if (count % 10 == 0)
				System.out.println(" ");
		}
	}
}