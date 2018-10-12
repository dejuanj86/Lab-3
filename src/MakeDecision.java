

import java.util.Scanner;

public class MakeDecision {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Hello! Please enter your name: ");
		String name = sc.nextLine();
		String question;
		
		do {
			System.out.println(name + " enter a number between 1 to 100: ");
			int userNum = sc.nextInt();
			if (userNum % 2 == 1) {
				System.out.println("The number is an odd.");
			} else if (userNum >= 2 && userNum <= 25) {
				System.out.println("The number is even and less than 25");
			} else if (userNum >= 26 && userNum <= 60) {
				System.out.println("Number is even");
			} else if (userNum > 60) {
				System.out.println("The number is even.");
			} else if (userNum > 60) {
				System.out.println("The number is odd");
			} 
			
			System.out.println("Would you like to continue?: ");
			sc.nextLine();
			question = sc.nextLine();
		} while (question.equalsIgnoreCase ("y"));
	     
	      System.out.println("Bye!");
	}
	
}


