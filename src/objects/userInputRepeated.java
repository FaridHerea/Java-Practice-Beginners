package objects;

import java.util.Scanner;

public class userInputRepeated {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String variable = myScanner.nextLine();
		System.out.println("Returns\n" + variable + "\n" + variable + "\nThe same user input twice.");
	}
}
