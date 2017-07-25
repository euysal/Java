import java.util.Scanner;

public class Homework4q6_6 {
	 public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please enter a line number");
		 int line=sc.nextInt();
		 displayPattern(line); 
		 
	 }
	 public static void displayPattern(int n){
		
	
		 for (int i = 1; i <= n; i++) {
		        for (int j = n; j > 0; j--) {
		            if (j > i) {
		                System.out.print("  ");
		            } else {
		                System.out.print(" " + j);
		            }
		        }
		        System.out.print("\n");
		 
		 }
	 }
}


