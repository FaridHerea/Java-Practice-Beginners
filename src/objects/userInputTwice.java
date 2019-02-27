package objects;

import java.util.Scanner;

public class userInputTwice {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("1st user input " + myScanner.nextLine());
		System.out.println("2nd user input " + myScanner.nextLine());
	}
}
