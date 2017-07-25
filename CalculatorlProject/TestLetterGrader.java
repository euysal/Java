package finalProject;

import java.util.Scanner;

public class TestLetterGrader {
	public static void main(String[] args) {
		String inputFile = args[0];
		String outputFile = args[1];
		
		LetterGrader grader = new LetterGrader(inputFile,outputFile);
		grader.generateGrades();
		System.out.println("\n\nPress ENTER to continue ...");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}
}
