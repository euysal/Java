import java.util.Scanner;

public class Homework3q4_24 {
public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the first city name ");
	String name1=sc.nextLine();
	System.out.println("Please enter the second city name ");
	String name2=sc.nextLine();
	System.out.println("Please enter the third city name ");
	String name3=sc.nextLine();

	if((name1.compareTo(name2) < 0) && (name1.compareTo(name3) < 0)){
       System.out.print("The three cities in alphabetical order are ");
        System.out.print(name1 + " ");
        if (name2.compareTo(name3) < 0){
        
            System.out.print(name2 + " ");
            System.out.print(name3);
        }
        else{
        
            System.out.println(name3+ " ");
            System.out.println(name2);
        }
    }      
	
else if((name1.compareTo(name2) > 0) && (name2.compareTo(name3) < 0)) {
      System.out.print("The three cities in alphabetical order are ");
        System.out.print(name2 + " ");
        if (name1.compareTo(name3) < 0){
        
            System.out.print(name1+ " ");
            System.out.print(name3);
        }
        else {
       
            System.out.print(name3 + " ");
            System.out.print(name1);
        }
    }
else {
     System.out.print("The three cities in alphabetical order are ");
    System.out.print(name3 + " ");
        if (name1.compareTo(name2) < 0) {
        
            System.out.print(name1 + " ");
            System.out.print(name2);
        }
        else {
        
            System.out.print(name2 + " ");
            System.out.print(name1);
        }
    }

	
	
}
}
