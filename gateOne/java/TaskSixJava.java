import java.util.Scanner;
public class TaskSixJava{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int sumOfScores = 0;
	int index = 1;
		for (int counter = 1; counter < 11; counter++){
		System.out.print("Enter score"+counter+": " );
		int userInput = scanner.nextInt();	
			if (userInput % 2 == 0){
				sumOfScores += userInput;
				index++;
			}
		}
		double averageOfScores = sumOfScores / index;
	System.out.println(averageOfScores);
	}
}