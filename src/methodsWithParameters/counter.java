package methodsWithParameters;

import java.util.Scanner;

public class counter {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		subCounter counterObject = new subCounter();
		
		int a = myScanner.nextInt();
		int counter = 0;
		
		counterObject.myCounter(a);
	}
}
