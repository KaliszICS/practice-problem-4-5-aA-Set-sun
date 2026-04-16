/* Title: Counters, Accumulators, and Nesting 4.5
Name: Angie
Date Created: April 14, 2026
Date Updated: April 15, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

		//System.out.println(triangle(3));
		//System.out.println(pyramid(4));
		System.out.println(multiplicationTable(3));
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

		for (int i = 0; i < num; i++) {

            for (int j = num - i; j > 1; j--) { //for spaces
                result = result + " ";
            }

            for (int j = 0; j <= i; j++) { //for asteriks
				if (i < 1) { //if it's only one or less 
					result = result + "*";
				} //else -> add a gap
                else {result = result + "* ";}

            }
			result = result.stripTrailing() + "\n"; //trims the last one before next line
            
        }
		return result;
	}


	public static String multiplicationTable (int num) {

		String table = "";

		for (int i = 1; i <= num; i++) {
			for (int b = 1; b <= num; b++) { //column
				if (b == i) {
					table = table.stripLeading() + " " + (i * b);
				} 
				else {table = table + " " + (i * b);}

			}
			table = table + "\n";
			
		}
		return table;
		
	}
			
			
}
		
	
	
		

