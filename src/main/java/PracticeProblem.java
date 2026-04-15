/* Title: Counters, Accumulators, and Nesting 4.5
Name: Angie
Date Created: April 14, 2026
Date Updated: April 15, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

		//System.out.println(triangle(3));
		System.out.println(pyramid(4));

	}

	public static String triangle (int num) {
		String result = "";

		for (int i = 1; i <= num; i++) {
			for (int asteriks = 0; asteriks < i; asteriks++) {
				result = result + "*";			
			}
			result = result + "\n";
		}
		return result;
	}

	public static String pyramid (int num) {
		String result = "";
		int space = 0;

		for (int i = 0; i < num; i++) {
			for (int n = num - i; n > 1; n--) { //for spaces -> start before num
                result = result + " ";
			}

			for (int n = 0; n <= i; n++) { //asteriks
				result = result + "*";
				if (i > 1) {
					result = result + "* ";
				}
			}
			result = result + "\n";
		}
		return result.stripTrailing() + "\n";
	}

			
}

	//public static String multiplicationTable (int num) {

	//	for (int i = 0; i < num; i++) {
			
	//	}
	//}
	
		

