import java.util.Scanner;

public class Homework3q4_21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean exit_loop=false;
		while(!exit_loop) {
			
			System.out.print("Enter a social security number DDD-DD-DDDD : ");
			// I take input as string so I can track characters
			String ssn=sc.nextLine();
			if(ssn.equalsIgnoreCase("exit")){
				exit_loop = true;
			}
			boolean checkssn=false;
			//  if (ssn.matches("[0-9]")==true) we can also check if we have just digit or not!
			// if lenght of sosical number is 11 charchter and third charchter is - and sixth charchter is - , it will be true.
			if(( ssn.length() == 11) && ( ssn.charAt(3) == '-' &&  ssn.charAt(6) == '-' )){
				checkssn=true;
				System.out.println(ssn+ "  is a valid ");
				}
			else{
					checkssn=false;
					System.out.println(ssn + " is an invalid \r\r");
	  
				}
			}
	}
}
