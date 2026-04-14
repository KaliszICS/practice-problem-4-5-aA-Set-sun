public class PracticeProblem {

	public static void main(String args[]) {

		System.out.println(triangle(3));
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
			for (int n = i; n < num; n++) {
				space++;
				while spaces 
				spaces = spaces + space;
				spaces = spaces.replaceAll(spaces, " ");

			}
			System.out.println(result);
			
			result = spaces + result + " " + '*';		
		}
		return result;

			
	}
	
		
}
