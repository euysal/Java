import java.util.Scanner;

public class Homework3_33 {
 public static void main (String[] args){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter weight");
	 float firstweight=sc.nextFloat();
	 System.out.println("And price for package 1");
	 float firstprice=sc.nextFloat();
	 // I got first weight/price of rice and I wanted to find 1 weight price
	 float first= firstprice/firstweight;
	 
	 System.out.println("Enter second weight");
	 float secondw=sc.nextFloat();
	 System.out.println("And price for the package 2");
	 float secondp=sc.nextFloat();
	// I got all information for second rice too and 1 weight price
	 float second= secondp/secondw;
	 // then I compare if second rice has less price than first one then second one has a betterprice
	 if (second < first){
		 System.out.println("Package 2 has a better price.");
		 // if second one has more price then first one, then first one has a better price 
	 }else {
		 System.out.println("Package 1 has a better price");
	 }
	 
 }
	
}
