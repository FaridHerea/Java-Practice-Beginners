package switchStatement;

import java.util.Scanner;

public class whatCarYouLike {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		String car;
		
		car = myScanner.nextLine();
		switch (car) {
		case "honda":
			System.out.println("Japanese cars are great!");
			break;
		case "dacia":
			System.out.println("I said cars!");
			break;
		case "mazda":
			System.out.println("Some Honda wanna be!");
			break;
		case "bmw":
			System.out.println("I should warn you that those cars come with signalization.");
			break;
		case "audi":
			System.out.println("My man!");
			break;
		case "mercedes":
			System.out.println("BMW driver number 2!");
			break;
		default:
			System.out.println("Lets talk about cars that everyone knows you dreamer, you!");
			break;
		}
	}
}
