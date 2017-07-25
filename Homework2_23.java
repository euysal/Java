import java.util.Scanner;

public class Homework2_23 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the driving distance :");
		float dis=sc.nextFloat();
		System.out.println("Enter miles per gallon");
		float miles=sc.nextFloat();
		System.out.println("Enter price per gallon");
		float price=sc.nextFloat();
		
		// first need to find 1 mile prices.
		float amile=price/miles;
		// then multiplication total miles to drive
		float total=amile*dis;
		
		System.out.println("The cost of driving is $"+ total);
		
	}

}
