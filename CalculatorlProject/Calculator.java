import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userChoice;
		// Scanner for taking the user input
		
		for(;;){
			// this for for loop will run the main code continuously every time when you press the key
            //  for (;;){ } this question was in the Quiz too 
			System.out.println("\nWelcome to Eda Uysal's Handy Calculator\n");
			System.out.println("\t1.Addition");
			System.out.println("\t2.Subtraction");
			System.out.println("\t3.Multiplication");
			System.out.println("\t4.Division");
			System.out.println("\t5.Exit");
			
			System.out.print("\nWhat would you like to do? ");
			// After that we ask the question 
			
			userChoice = getUserChoice(sc); 
			//getting the user choice and use it in switch condition and comment what to do inside the cases
			
			float [] myFloats = new float[2];
			float result;			
			// I want to take 2 floats number and also create result float to print calculation result
			
			// I wrote the codes for each section number from 1 to 5 
			switch(userChoice){
			case 1:
				// when user entered number 1 and addition condition
				System.out.print("\nPlease enter two floats to add, separated by a space: ");
				getTwoFloats(myFloats, sc, false);
				result=myFloats[0]+ myFloats[1];
				System.out.println("Result of addition " + myFloats[0] + " and " + myFloats[1] + " is " + result);
				break;
			case 2:
				// when user entered number 2 and subtraction condition
				System.out.print("\nPlease enter two floats to take away, separated by a space: ");
				getTwoFloats(myFloats, sc, false);
				result=myFloats[0]- myFloats[1];
				System.out.println("Result of subtraction " + myFloats[0] + " and " + myFloats[1] + " is " + result);
				break;
			case 3:
				// when user entered number 3 and multiplication condition
				System.out.print("\nPlease enter two floats to multiply, separated by a space: ");
				getTwoFloats(myFloats, sc, false);
				result=myFloats[0]* myFloats[1];
				System.out.println("Result of multiplication " + myFloats[0] + " and " + myFloats[1] + " is " + result);
				break;
			case 4:
				// when user entered number 4 and division condition
				System.out.print("\nPlease enter two floats to divide by , separated by a space: ");
				getTwoFloats(myFloats, sc, true);
				// it needs to be true because of divided by 0 infinity
				// more details inside the method 
				result=myFloats[0]/ myFloats[1];
				System.out.println("Result of division " + myFloats[0] + " and " + myFloats[1] + " is " + result);
				break;
			case 5:
				// when user enterted number 5 and user wants to exit the program
				System.out.println("\nThank you for using <Eda Uysal'>s Handy Calculator");
				System.exit(0);
				break;
			}

			
			// if you press any key it will go to Scanner nextline and start from beginning again
			System.out.println("\nPress enter key to continue ...");
			sc.nextLine();
			sc.nextLine();
		
		}
	}
	
	public static int getUserChoice(Scanner readInput){ 
		int inputInt;
		do { 
			// start loop to get correct answer
			//System.out.print("What would you like to do? ");
			System.out.print("");
			try {
				inputInt = readInput.nextInt();
				// waits for user input
				if (inputInt >= 1 && inputInt <= 5) {
					break; // if you select 1 to 5 , you got it and give break
				} 
				else {
					System.out.print("You have not entered a number between 1 and 5. Please, re-enter your choice: ");
					continue;
					// it will continue till you get number between 1 to 5 
				}
			} 
			catch (final InputMismatchException e) {
				System.out.print("You have entered an invalid choice. Please, re-enter your choice: ");
				readInput.nextLine(); // discard non-int input continue;
				// keep looping until you found right onee
				// it is try-catch. if it is not valid input, it will keep contunie and give exception 
			}
		} while (true);
	return inputInt;
	//if you give right input, it will return it the number
	}
	

	public static void getTwoFloats(float [] myFloats, Scanner readInput, boolean isDivision){
	
		
	do { 
		// start loop till we have correct input
		// I give a space because I asked the question in switch loop
		System.out.print(" ");
	try {
	myFloats[0] = readInput.nextFloat();
	// get first number from user 
	myFloats[1] = readInput.nextFloat();
	// gets second number from user
	
	// if isDivision is true and second number is equal to 0, it will be infinity loop while dividing fist number with second number 0 
	if( isDivision && myFloats[1] == 0){
		System.out.print("You can't divide by zero please re-enter both floats: ");
		continue;
	}
	//if you are here, the floats were good, you //are done, break out from loop
	break;
	
	} catch (final InputMismatchException e) { 
		System.out.print("You have entered an invalid float. Please re-enter: "); 
		readInput.nextLine();
	 // exception if you entered invalid float
	
	
	// discard non-float input
	continue;
	// keep looping until you found right one
	  }
	} while (true);
	
	}
}
