package finalProject;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LetterGrader {
	String inputFileName;
	String outputFileName;
	
	ArrayList<Integer> q1List;
	ArrayList<Integer> q2List;
	ArrayList<Integer> q3List;
	ArrayList<Integer> q4List;
	ArrayList<Integer> midIList;
	ArrayList<Integer> midIIList;
	ArrayList<Integer> finalList;
	
	public LetterGrader(){}
	public LetterGrader(String inputFile,String outputFile) {
		this.inputFileName = inputFile;
		this.outputFileName = outputFile;
		
		q1List = new ArrayList<Integer>();
		q2List = new ArrayList<Integer>();
		q3List = new ArrayList<Integer>();
		q4List = new ArrayList<Integer>();
		midIList = new ArrayList<Integer>();
		midIIList = new ArrayList<Integer>();
		finalList = new ArrayList<Integer>();
		
	}
	
	public float getAvg(ArrayList<Integer> scores){
		int count = scores.size();
		float sum = 0;
		float avg = 0;
		for(int i=0; i< count; i++){
			sum += scores.get(i);
		}
		avg = sum / count;
		return avg;
	}
	
	public int getMin(ArrayList<Integer> scores){
		int count = scores.size();
		int min = scores.get(0);
		for(int i=1; i< count; i++ ){
			if( min > scores.get(i)){
				min = scores.get(i);
			}
		}
		return min;
	}
	
	public int getMax(ArrayList<Integer> scores){
		int count = scores.size();
		int max = scores.get(0);
		for(int i=1; i< count; i++ ){
			if( max < scores.get(i)){
				max = scores.get(i);
			}
		}
		return max;
	}
	
	public String processGrade(String line){
		String[] array=line.split(",");
		 String fullname=array[0];
		 int q1=Integer.parseInt(array[1].trim()); 
		 int q2=Integer.parseInt(array[2].trim()); 
		 int q3=Integer.parseInt(array[3].trim()); 
		 int q4=Integer.parseInt(array[4].trim());
		 int m1=Integer.parseInt(array[5].trim());
		 int m2=Integer.parseInt(array[6].trim()); 
		 int fin=Integer.parseInt(array[7].trim());
		 
		 q1List.add(q1);
		 q2List.add(q2);
		 q3List.add(q3);
		 q4List.add(q4);
	
		 midIList.add(m1);
		 midIIList.add(m2);
		 finalList.add(fin);

		
		 double avg=q1* 0.10+q2*0.10+q3*0.10+q4*0.10+m1*0.20+m2*0.15+fin*0.25;
		 
		 String score;
			if(avg>=90){
				score="A";
			}
			else if(avg>=80 && avg<=89){
				score="B";
			}
			else if(avg>=70 && avg<=79){
				score="C";
			}
			else if(avg>=60 && avg<=69){
				score="D";
			}
			else {
				score="F";
			}
			return score;
		 
		 
	}
	
	
	
	public void generateGrades(){
		File file = new File(this.inputFileName);
		Scanner input=null;
		PrintWriter writer=null;
		double q1Sum=0;
		double q2Sum=0;
		double q3Sum=0;
		double q4Sum=0;
		double mid1Sum=0;
		double mid2Sum=0;
		double finalSum=0;
		int count = 0;
		
		
		try {
			input=new Scanner(file);
			writer = new PrintWriter(this.outputFileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		while(input.hasNextLine()){
			 String line=input.nextLine();
			 String grade = processGrade(line);
			 String[] array=line.split(",");
			 String fullname=array[0];
			 // write name and grades to output file
			 writer.print(String.format("%-25s", fullname));
			 writer.println(grade);
			 count=count+1;	
			 
		}
		
		System.out.println("Here is the class averages:");
		System.out.println(String.format("%-10s %10s %10s %10s %10s %10s %10s %10s","", "Q1", "Q2", "Q3", "Q4", "MidI", "MidII", "Final"));
		
		double q1Avg = this.getAvg(q1List);
		double q2Avg = this.getAvg(q2List);
		double q3Avg = this.getAvg(q3List);
		double q4Avg = this.getAvg(q4List);
		double midIAvg = this.getAvg(midIList);
		double midIIAvg = this.getAvg(midIIList);
		double finalAvg = this.getAvg(finalList);		
		
		System.out.println(String.format("%-10s %10.2f %10.2f %10.2f %10.2f %10.2f %10.2f %10.2f","Average:", q1Avg, q2Avg, q3Avg, q4Avg, midIAvg, midIIAvg, finalAvg));
		
		double q1Min = this.getMin(q1List);
		double q2Min = this.getMin(q2List);
		double q3Min = this.getMin(q3List);
		double q4Min = this.getMin(q4List);
		double midIMin = this.getMin(midIList);
		double midIIMin = this.getMin(midIIList);
		double finalMin = this.getMin(finalList);		
		
		System.out.println(String.format("%-10s %10.2f %10.2f %10.2f %10.2f %10.2f %10.2f %10.2f","Minimum:", q1Min, q2Min, q3Min, q4Min, midIMin, midIIMin, finalMin));
		
		double q1Max = this.getMax(q1List);
		double q2Max = this.getMax(q2List);
		double q3Max = this.getMax(q3List);
		double q4Max = this.getMax(q4List);
		double midIMax = this.getMax(midIList);
		double midIIMax = this.getMax(midIIList);
		double finalMax = this.getMax(finalList);		

		System.out.println(String.format("%-10s %10.2f %10.2f %10.2f %10.2f %10.2f %10.2f %10.2f","Maximum:", q1Max, q2Max, q3Max, q4Max, midIMax, midIIMax, finalMax));
		
		writer.close();
	}
	


}
