
public class Homework3_4 {

	public static void main(String[] args){
		// randomly select a number between 1 and 12
		int  month = (int) ((Math.random()*12)+1);
		// we need string data type to type month names to display
		String monthnames;
	// we use switch case to display month depends on what number is 
		switch (month){
			case 1: monthnames="January";
			break;
			case 2: monthnames="February";
			break;
			case 3: monthnames="March";
			break;
			case 4: monthnames="April";
			break;
			case 5: monthnames="May";
			break;
			case 6: monthnames="June";
			break;
			case 7: monthnames="July";
			break;
			case 8: monthnames="August";
			break;
			case 9: monthnames="September";
			break;
			case 10: monthnames="October";
			break;
			case 11: monthnames="November";
			break;
			case 12: monthnames="December";
			break;
			
			// if the number more than 12 or case more than 12 it will be invalid value 
			default: monthnames="Invalid month";
			break;
		}
		// we print the randomly month numbers on the screen 
		System.out.println(monthnames);
	}
}
