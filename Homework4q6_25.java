import java.util.Scanner;

public class Homework4q6_25 {
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter time in milliseconds");
		int millis=sc.nextInt();
		System.out.println(convertMillis(millis));
	
		
}
	public static String convertMillis(long millis){
		// we had this example homework2_8
		long totalSeconds = millis / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60; 
        // to display hours, minutes, seconds as a string
        StringBuilder s = new StringBuilder();
        s.append(totalHours + ":");
        s.append(totalMinutes % 60 + ":");
        s.append(totalSeconds % 60);

        return s.toString();
	}
}