/**
	* File: Lesson 4.5 - Nested Loops
	* Author: Mr. Kalisz
	* Date Created: April 11, 2023
	* Date Last Modified: April 11, 2023
	*/

class Notes {
	public static void main(String args[]) {

		//for loop

		// for (int i = 0; i < 5; i++) {
		// 	System.out.println(i);
		// }
		
		//while loop

		// int num = 0;

		// while (num < 10) {
		// 	System.out.println(num);
		// 	num++;
		// }
		
		//nested loops

		int count;
		count = 0;
		
		// for (int i = 0; i < 5; i++) { //this loop runs 5 times
		// 	for (int j = 0; j < 5; j++) {//this loop runs 5 times
		// 		count++;//25  = 5x5 of our loop iterations
		// 	}
		// }
		// System.out.println(count);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) { //runs when i is 0, 1, 2, 3, 4
				count++; //10 = 1 + 2 + 3 + 4
				System.out.print(j);
			}
			System.out.println(); //newline to seperate each inner for loop
		}
		System.out.println(count); //total number of times inner loop ran
		
	}
}