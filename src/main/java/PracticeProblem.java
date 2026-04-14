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

			for (int j = num - 1; j > i - 1; j--) {
                System.out.print(" ");
			}
			
			for (int n = i; n < num; n++) {
			}
			System.out.println(result);
			
			result = result + "* ";		
		}
		return result;

			
	}
	
		
}
