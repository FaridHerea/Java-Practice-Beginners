package methodsWithParameters;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		subSum theSum = new subSum();
		
		int a = myScanner.nextInt();
		int b = myScanner.nextInt();
		int s = 0;
		
		theSum.sum(a, b, s);
	}
}
