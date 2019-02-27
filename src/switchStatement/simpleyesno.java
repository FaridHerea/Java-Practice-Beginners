package switchStatement;

import java.util.Scanner;

public class simpleyesno {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		String answer;
		
		System.out.println("Are you proud of what you've done so far?");
		answer = myScanner.nextLine();
		switch (answer) {
		case "yes":
			System.out.println("Good for you!");
			break;
		case "no":
			System.out.println("Work harder than!");
			break;
		case "maybe":
			System.out.println("We accept only straight answers here!");
			break;
		default:
			System.out.println("This is not an answer boy!");
			break;
		}
	}
}
