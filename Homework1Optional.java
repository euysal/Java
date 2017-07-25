
public class Homework1Optional {
 public static void main(String[] args){
	 // current population
	 double cpopulation=312032486.0;
	 // birth every min
	 double birth=60.0/7.0;
     // death every min 
	 double death=(60.0/13.0);
	 //new immigration every min 
	 double immigrant=60.0 /45.0;
	 //everyyear population= birth number plus immigration and miles death numbers of people in a hour
	 // multiplication  60 minutes, 24 hours , 365 days in a year.
	 double everyyear=(( (((birth+immigrant)-death)*60)*24)*365);
	 
	 double popu2018=cpopulation+everyyear;
	 System.out.println("next year 2018 population number is " + popu2018 + "\n");
	 
	 double popu2019=popu2018+everyyear;
	 System.out.println("the year 2019 population number is " + popu2019 + "\n ");
	 
	 double popu2020=popu2019+everyyear;
	 System.out.println("the year 2020 population number is " + popu2020 + "\n ");
	 
	 double popu2021=popu2020+everyyear;
	 System.out.println("the year 2021 population number is " + popu2021 + "\n ");
	 
	 double popu2022=popu2021+everyyear;
	 System.out.println("the year 2022 population number is " + popu2022 + "\n ");
	 
	
 }
}
