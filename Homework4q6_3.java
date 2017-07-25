import java.util.Scanner;

public class Homework4q6_3 {
	
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter an integer ");
		int num = sc.nextInt();
		reverse(num);
		String palindrome = num+"";
	    boolean result = palindrome.equals(new StringBuilder(palindrome).reverse().toString());
	    System.out.println();
	    //System.out.println(result);
	    
	    if (result==true){
			System.out.println("The number is a Palindrome.");
		}else {
		    System.out.println("The number is a not Palindrome.");
		}
	    
		
	}
	
		//return the reversal of an integer, ie.t., reverse(456) returns 654
		public static  int reverse (int number)
		{
			int tempDigit = 0;

	        while (number !=0){

	            tempDigit = number % 10; 
	            System.out.print(tempDigit);
	            number = number / 10;
			
			
			if(number>Integer.MAX_VALUE || number<Integer.MIN_VALUE){
				throw new IllegalArgumentException();
			}

 }
	        
			return tempDigit;
			
			
}
		//return true if number is a palindrome
		public static boolean isPalindrome(int number){
	
			
			//int number;
			int x=reverse(number);
			boolean result;
			
			if (x==number){
				result= true;
				//System.out.println("The number is a Palindrome.");
			}else {
				result= false;
			   // System.out.println("The number is a not Palindrome.");
			}
			return result;
		
			
		}
	
	


}
