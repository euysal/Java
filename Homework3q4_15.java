import java.util.Scanner;

public class Homework3q4_15 {

	public static void main(String[] args) {
		// I call a letter from scannner what user entered 
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a letter, please=");
		String letter=sc.nextLine();
		// I return any lowercase letter to upper case so it will be easy to catch the letter 
		String let=letter.toUpperCase();
		// I will use if loop, depends to user what entered, it will display the responding number 
		
			if (let.equals("A")|| let.equals("B") || let.equals("C")){
				System.out.println("The corresponding number is 2");
				}
			else if(let.equals("D")|| let.equals("E") || let.equals("F")){
				System.out.println("The corresponding number is 3");
			}
			else if (let.equals("G")|| let.equals("H") || let.equals("I")){
				System.out.println("The corresponding number is 4");
			}
			else if(let.equals("J")|| let.equals("K")|| let.equals("L")){
				System.out.println("The corresponding number is 5");
			}
			else if (let.equals("M")|| let.equals("N") || let.equals("O")){
				System.out.println("The corresponding number is 6");
			}
			else if (let.equals("P")|| let.equals("Q")||let.equals("R") || let.equals("S")){
				System.out.println("The corresponding number is 7");
			}
			else if (let.equals("T")|| let.equals("U") || let.equals("V")){
				System.out.println("The corresponding number is 8");
			}
			else if (let.equals("W")|| let.equals("X") || let.equals("Y") || let.equals("Z")){
				System.out.println("The corresponding number is 9");
			}else {
				// end of the if loop, if user enters invalid character, I wanted to ask to user to enter a valid letter 
				System.out.println("Please enter a valid letter/charachter");
				
			}
		}
		
	}


