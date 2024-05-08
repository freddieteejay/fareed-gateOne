import java.util.Scanner;
public class TaskTwoJava{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int sumOfScores = 0;
	int averageScores = 0;
	for (int counter = 1; counter < 11; counter++){
		System.out.print("Enter score"+counter+": " );
		int userInput = scanner.nextInt();
		sumOfScores += userInput;
		averageScores = sumOfScores / counter;
	} 
	System.out.print(averageScores);
}
}