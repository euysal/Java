import java.util.Random;

public class Homework5_7_7 {
	public static void main (String[] args){
	
		int[] numbers = new int[100];
	    int[] display = new int[10];
		// generate random numbers 0-9
        for (int i = 0; i < numbers.length; i++) {
            int num = (int)(Math.random() * 10);
            numbers[i] = num;
            display[num]++;
            System.out.println(num);
        }
        // display how many times numbers appeares 
        System.out.println("======");
        for (int i = 0; i < display.length; i++) {
            System.out.println("number "+ i + " display " + display[i] + " times ");

	}
	
}
}