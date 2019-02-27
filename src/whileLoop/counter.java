package whileLoop;

import java.util.Scanner;

public class counter {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		int counter = 0, answer;
		
		answer = myScanner.nextInt();
		while (counter <= answer) {
			System.out.print(counter + " ");
			counter++;
		}
	}
}
