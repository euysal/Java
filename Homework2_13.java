import java.util.Scanner;

public class Homework2_13 {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the montly saving account: 100<-1");
		double amount=sc.nextDouble();
		// montly interest rate
		double rate=(1+0.00417);
		// first month total and so on for each month plus adding previous amount money too 
		double first=amount*rate;
		double second= (first+amount)*rate;
		double third=(second+amount)*rate;
		double fourth=(third+amount)*rate;
		double fifth=(fourth+amount)*rate;
		double sixth=(fifth+amount)*rate;
		
		System.out.println("After the sith month, the account value is "+ "$"+ sixth);
		
		
		
	}

}
