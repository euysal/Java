import java.util.Scanner;

public class Extra3Homework {
	public static void main(String[] args) {
		for ( ; ; ){
		int x=getUserChoice();
		//System.out.println(x);
		//getUserChoice()
		switch(x){
		case 1: 
			System.out.println("your choice 1 title");
			break;
		case 2:
			System.out.println("your choice 2 rank");
			break;
		case 3:
			System.out.println("your choice 3 date");
			break;	
		case 4:
			System.out.println("your choice 4 stars");
			break;	
		case 5:
			System.out.println("your choice 5 likes");
			break;
		case -1:
			System.out.println("You entered invalid choice. Try again");
		default:
		System.out.println("you have not entered a number between 1 to 5, try again!");
		}
		}
	}
		public static int getUserChoice(){
			System.out.println();
			System.out.println("Welcome to sorting program");
			System.out.println("1.title");
			System.out.println("2.Rank");
			System.out.println("3.date");
			System.out.println("4.stars");
			System.out.println("5.likes");
			System.out.print("Enter your choice between 1 and 5 only: ");
			
			Scanner sc=new Scanner(System.in);
			int choice=-1;
			
			String entry = sc.nextLine();
			try{
				choice = Integer.parseInt(entry);
			} catch(Exception e){
				//System.out.println("you have entered an invalid choice. Try again");
			}
	
			//System.out.println(sc.nextLine());			
			return choice;
			
			
		}
	}




