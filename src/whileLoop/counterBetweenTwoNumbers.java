package whileLoop;

import java.util.Scanner;

public class counterBetweenTwoNumbers {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		int a, b, c;
		a = myScanner.nextInt();
		b = myScanner.nextInt();
		
		if (a <= b) {
			c = a;
		} else {
			c = b;
		}
		while (c <= a || c <= b) {
			System.out.print(c + " ");
			c++;
		}
		
	}
}
