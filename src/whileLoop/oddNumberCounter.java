package whileLoop;

import java.util.Scanner;

public class oddNumberCounter {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		int counter = 1, answer;
		answer = myScanner.nextInt();
		
		
		while (answer >= counter) {
			System.out.print(counter + " ");
			counter+=2;
		}
	}
}
