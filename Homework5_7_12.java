import java.util.Arrays;
import java.util.Scanner;

public class Homework5_7_12 {

	public static void main(String[] args) {
		 
			Scanner sc=new Scanner(System.in);  
		   System.out.println("Enter ten numbers");
		   int[] tenNum=new int[10];
		   // method is double so we have to use double data type 
		  for(int i=0; i<tenNum.length; i++){
			  tenNum[i]=sc.nextInt();
		  }
		 
		  System.out.println("Original " + Arrays.toString(tenNum));
		 System.out.println("Reverse " + Arrays.toString(reverse(tenNum)));
		}

	
	public static int[] reverse(int[] list){
	 for(int i=0; i<list.length/2; i++){
		 int temp=list[i];
		 int j=list.length-(i+1); // list.length-i;
		 list[i]=list[j];
		 list[j]=temp;
	 }
	 return list;
	}
}


