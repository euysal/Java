import java.util.Scanner;

public class Howewor2 {
	public static void main(String[] args){
		// Answer of question 2.6
		Scanner sc= new Scanner(System.in);
		System.out.println("Please, enter a number between 0 and 1000:999<-1");
		int x=sc.nextInt();
		// we need to create a data type to call sum(sum of all numbers) and remainnumber after x%10
		int sum;
		int remainnumber1;
		// we will modulus each digit and save them to sum later and divide each remainnumbers till 0 digit
		// less than 999 we will have max 3 digits.
		int firstdigit=x%10;
		remainnumber1=x/10;
		
		int seconddigit=remainnumber1%10;
		int remainnumber2=remainnumber1/10;
		
		int lastdigit=remainnumber2%10;
		
	    sum=firstdigit+seconddigit+lastdigit;
	    
	    System.out.println("The sum of the digits is "+ sum);
		
	  
				
	}

}
