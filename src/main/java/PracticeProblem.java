/* Title: Counters, Accumulators, and Nesting 4.5
Name: Angie
Date Created: April 14, 2026
Date Updated: April 15, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

		System.out.println(triangle(5));
		System.out.println(pyramid(4));

	}

	public static String triangle (int num) {
		String result = "";

		for (int i = 0; i < num; i++) {
			System.out.println(result); 
			result = result + '*';			
		}
		return result;
	}

	public static String pyramid (int num) {
		String result = "";
		String spaces = " ";
		int space = 0;

		for (int i = 0; i < num; i++) {

			for (int j = num - 1; j > i - 1; j--) { //start before num, 
                System.out.print(" ");
			}
			
			for (int n = i; n < num; n++) {
			}
			System.out.println(result);
			
			result = result + "* ";		
		}
		return result + "\n";

			
	}

	public static String multiplicationTable (int num) {

		for (int i = 0; i < num; i++) {
			
		}
	}
	
		
}
