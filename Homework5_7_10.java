import java.awt.List;
import java.util.Arrays;
import java.util.Scanner;

public class Homework5_7_10 {

	public static void main (String[] args){
		// returns the index of the smallest element in an array of integers
		 double[] tenNum=new double[10];
		Scanner sc=new Scanner(System.in);  
	   System.out.println("Enter ten numbers");
	   // method is double so we have to use double data type 
	  for(int i=0; i<tenNum.length; i++){
		  tenNum[i]=sc.nextDouble();
	  }
	  System.out.println("The smallest index is " + indexOfSmallestElement(tenNum));
	  
	}
		// smallest index is mean in the array list first entered number is the smallest index which mean [0]
 public static int indexOfSmallestElement(double[] array){
	
	  double min=array[0];// min is the smallest index
	  int minIndex=0;
	  for (int i=0; i<array.length; i++){
		  if(array[i]<min){
		  min=array[i];
		  minIndex=i;
	   }
	 }
	return minIndex;
	// invoke this method to display index of the smallest element 	}
	 
	  
	}
	
}
