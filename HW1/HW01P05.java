/*
1 day = 86400  seconds
1 year = 365 days
5 year = 1825 days
*/

public class HW01P05 {
	
	//method main(): application entry point
	public static void main(String[] args) {
		System.out.println("Population in 5 years is " );
		System.out.println(((60 * 60 * 24 * 365 * 5) * ((1.0/7) - (1.0/13) + (1.0/45))) + 312032486);
	}
	
}