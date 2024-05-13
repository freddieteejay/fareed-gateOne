import java.time.Year;
import java.time.LocalDate;
import java.util.Scanner;
public class MyAge{
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	String userInput;
	System.out.println("Enter your Details in this format (DAY-MONTH-YEAR!!)");
	do{
	System.out.println("Please enter your date of birth : ");
		String user = scanner.nextLine();
		userInput = user.replaceAll("[-.,; ]", "").replace("jan", "01").replace("feb", "02").replace("mar", "03");
		}while(userInput.length() != 8);
	String result = myAge(userInput);
	System.out.print("You are "+result+" Years old");

	}
	public static String myAge(String userInput){
		String allNum = userInput;
		String ThisDays = allNum.substring(0, 2);
		int days = Integer.parseInt(ThisDays);
		String month = allNum.substring(2, 4);
		int months = Integer.parseInt(month);
		String years = allNum.substring(4, 8);
		int year = Integer.parseInt(years);
		Year todayYear = Year.now();
		int currentYear = todayYear.getValue();
		LocalDate mon = LocalDate.now();
		int currentMonth = mon.getMonthValue();
		int currentDay = mon.getDayOfMonth();
		int yourAge = 0;
		if (currentMonth < months || currentDay < days ){
			yourAge = currentYear - year - 1;
		}else{
		yourAge = currentYear - year;
		}
		String age = String.valueOf(yourAge);
		
	

	return age;
	}

}