import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExtraHW6 {
	public static void main(String[] args){
		
		processInputOutputFiles(args);
	}
	public static void processInputOutputFiles(String[] args) {
		File file = new java.io.File("input_final.txt");
		if (!file.exists()) {
		      System.out.println("files do not exist");
		     System.exit(2);
		    }
		Scanner readInput;
		String line;
		String [] parseWords;
		try {
			readInput = new Scanner(file);
			while (readInput.hasNextLine()) {
				line = readInput.nextLine();
				parseWords = line.split(",");
				for (int i = 0; i < parseWords.length; i++)
					System.out.print(parseWords[i] + " "); 
				System.out.println();
			}
		
	}catch(Exception e){
		
	}
		finally {
		
	}
	}	
}