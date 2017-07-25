import java.util.Arrays;
import java.util.Scanner;

public class Homework5_7_17Opt {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("How many students do you have: ");
        int number = sc.nextInt();
        String[] names = new String[number];
        int[] array = new int[number];
        for(int i = 0; i < number; i++) {
            System.out.print("Enter the student's name: ");
            names[i] = sc.next();
            System.out.print("And enter the student's score: ");
            array[i] = sc.nextInt();
        }
        printByScore(names, array);
        System.out.println("This is list of students order by their score= "+Arrays.toString(names));
    }
    public static void printByScore(String[] names, int[] array) {
        for(int i = array.length - 1; i >= 1; i--) {
            String temp;
            int Max = array[0];
            int MaxIndex = 0;
            for(int j = 1; j <= i; j++) {
                if (Max > array[j]) {
                    Max = array[j];
                    MaxIndex = j;
                }
            }       
                if (MaxIndex != i) {
                    temp = names[MaxIndex];
                    names[MaxIndex] = names[i];
                    names[i] = temp;
                    array[MaxIndex] = array[i];
                    array[i] = Max;
                }
}
}
}