import java.util.Scanner;
import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;

public class MenstrualApp{
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	String first;
	LocalDate firstDate;
	int cycleLength = 0;
	System.out.println("<<<<<<<<<<<<<<<<<Welcome to Belle rejector app>>>>>>>>>>>>>>");
	do{
	System.out.println("Enter the first day of your last menstrual period in YYYY-MM-DD format");
		 first = scanner.next();
		firstDate = LocalDate.parse(first);
	System.out.println("Enter the average menstrual cycle length: ");
		cycleLength = scanner.nextInt();
		}while(first.charAt(2) == '-');

		myDate(firstDate, cycleLength);
	}


	public static void myDate(LocalDate firstDate, int cycleLength){
		LocalDate ovulationDate = firstDate.plusDays(cycleLength - 14);
		LocalDate safePeriodStart = ovulationDate.minusDays(5);
		LocalDate safePeriodEnd =ovulationDate.plusDays(3);
		LocalDate flow = firstDate.plusDays(cycleLength);

		System.out.println("Ovulaation Date: "+ovulationDate);
		System.out.println("Safe period Start date: "+safePeriodStart);
		System.out.println("Safe period End date: "+safePeriodEnd);
		System.out.println("Your next Flow period is : "+flow);


	}
}