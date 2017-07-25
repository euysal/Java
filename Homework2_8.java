import java.time.LocalTime;
import java.util.Scanner;

public class Homework2_8 {

	public static void main(String[] args) {
		
		LocalTime time=LocalTime.now();
		System.out.println("Local time is now " + time);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT");
		int timezone=sc.nextInt();
		// I explained each step by giving simple names like totalhours, secondsn minutes and so on. 
		long totalmillisec=System.currentTimeMillis();
		long totalsec=totalmillisec/1000;
		long currentsec=totalsec%60;
		long totalmin=totalsec/60;
		long currentmin=totalmin%60;
		long totalhour=totalmin/60;
		
		long currenthour=totalhour% 24;
		
		currenthour=currenthour+ timezone;
		
		System.out.println("The current time is "+currenthour +":"+  currentmin +":"+ currentsec);
		
	}

}
