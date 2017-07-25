import java.util.Arrays;
import java.util.Scanner;

public class Homework5_7_31Opt {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		 System.out.print("Enter list1(First number indicate your index numbers)= ");
		  int[] list1 = new int[sc.nextInt()];
		  for (int i = 0; i < list1.length; i++) {
		   list1[i] = sc.nextInt();
		  }
		 
		  System.out.print("Enter list2(First number indicate your index numbers)= ");
		  int[] list2 = new int[sc.nextInt()];
		  for (int i = 0; i < list2.length; i++) {
		   list2[i] = sc.nextInt();
		  }
		 
		  int[] list3 = merge(list1, list2);	 
		  System.out.print("The merged list is " + Arrays.toString(list3)); 
		 
		 }
		 
   public static int[] merge(int[] list1, int[] list2) {
		 int[] list3 = new int[list1.length + list2.length];
		 
		  int j = 0, k = 0;
		  for (int i = 0; i < list3.length; i++) {
		   if (k < list2.length&&list1[j] > list2[k] ) {
		    list3[i] = list2[k];
		    k++;
		   } else if (j < list1.length) {
		    list3[i] = list1[j];
		    j++;
		   }
		 
		  }
		  return list3;		 
		 }		
}
	


