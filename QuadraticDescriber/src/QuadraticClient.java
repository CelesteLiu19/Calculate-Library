


import java.util.*;
public class QuadraticClient {
	public static void main(String[] arg) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to the Quadratic Describer!");
		System.out.println("The standard from of a Quadratic equation is:  ax^(2) + bx + c");
		Boolean exit = false;
		
		do {
			System.out.println("Provide inputs for co-efficients a, b, and c with spaces in between each number.");
			System.out.println("");
			double a = userInput.nextDouble();
			double b = userInput.nextDouble();
			double c = userInput.nextDouble();
			System.out.println("");
		
			if(a == 0) {
				System.out.println("This is not a valid quadratic equation.");
			}
			else {
				System.out.println("a: " + a);
				System.out.println("b: " + b);
				System.out.println("c: " + c);	
				System.out.println("");
				System.out.println(Quadratic.quadDescriber(a, b, c));
				System.out.println("");
			}
	
			System.out.println("Do you want to keep going? (Type \"quit\" to end or \"again\" to continue)");
			String quit = userInput.next();
			char confirmQuit = quit.charAt(0);
			if (confirmQuit == 'q') {
				exit = true;
				userInput.close();
			}
		} while (exit == false);
		
	}
}
