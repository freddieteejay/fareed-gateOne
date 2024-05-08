import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class TaskOne{
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);

	ArrayList <Integer> correct = new ArrayList<>();
	ArrayList <Integer> incorrect = new ArrayList<>();
		int number = 0;
		for(int counter = 0; counter < 5; counter++){
		Random randomNum1 = new Random();
			int showMe = randomNum1. nextInt(10);
		Random randomNum2 = new Random();
			int newOne =  randomNum2.nextInt(10);

			System.out.print(showMe+ "x"+newOne +" = ");
				int num = scanner.nextInt();
				if (num == showMe * newOne){
					correct.add(num);
				}
				else{
					incorrect.add(num);
				}
								
			System.out.print(showMe+ "+" +newOne+" = ");
				int sum = scanner.nextInt();
				if (sum == showMe + newOne){
					correct.add(sum);
				}
				else{
					incorrect.add(sum);
				}

		}
		
		System.out.println("The total correct score is : "+correct.size());
		System.out.println("The total incorrect score is :"+ incorrect.size());

	}
}


