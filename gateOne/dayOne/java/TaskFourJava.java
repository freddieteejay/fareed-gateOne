import java.util.Scanner;
public class TaskFourJava{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int sumOfScores = 0;
		for (int counter = 100; counter < 110; counter++){
		System.out.print("Enter score"+counter - 99+": " );
		int userInput = scanner.nextInt();
		if (counter % 2 == 0){
			sumOfScores += userInput;
		}
	} 
	System.out.println(sumOfScores);
	}
}