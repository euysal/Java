import java.util.Scanner;

public class Homework3q4_17 {

	//private static final boolean True = null;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a year");
		int year=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please enter first 3 letters of a month (First letter is Uppercase,rest of it lowerCase)");
		String month=sc.nextLine();
		
	// we need to calculate leap year which you have shared the logic in second class
		boolean leapYear=((year%4==0 && year%100!=0) ||(year%100==00));
		// we can use switch loop and we can tell the total days numbers in a month
		switch (month){
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec": System.out.println(month + " " + year + " " + "has 31 days. ");
		break ;
		
		case "Apr":
	 	case "Jun":
		case "Sep":
		case "Nov": System.out.println(month + " " + year + " " + "has 30 days. ");
		break;
		// since Feb has leapyear rule, I use if loop in Feb case to find out exact days number 
		case "Feb":
			if(leapYear){
				System.out.println(month + " " + year  + " has 29 days ");
			}
			else {
				System.out.println(month + " " + year + " has 28 days ");
			}
		}
		

	}

}
