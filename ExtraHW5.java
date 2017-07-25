import java.io.File;

public class ExtraHW5 {
	public static void main(String[] args) {
        
        processCLArguments(args);
	}
	public static void processCLArguments(String[] args){
		
		if (args.length < 2) {
		      System.out.println(
		        "Usage: java Exercise5 inputFile outputFile");
		      System.exit(1);
		    }
		
		java.io.File fileinput = new java.io.File("input.txt");
		java.io.File fileoutput = new java.io.File("output.txt");
		
		if (!fileinput.exists() && !fileoutput.exists()) {
		      System.out.println("files do not exist");
		      System.exit(2);
		    }

		  
	    if (fileinput.exists() && fileoutput.exists()) {
		      System.out.println("Input will be read from: input_final.txt");
		      System.out.println("Output will be written into: output_final.txt");
		      System.exit(3);
		      System.out.println();

	}

}
}