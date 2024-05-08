import java.util.*;
public class TaskTwo{
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	int[] scores = new int [10];

	for(int counter = 0; counter < scores.length; counter++){
	System.out.print("enter scores : ");
		int score = scanner.nextInt();
		scores[counter] = score;
	
	}
	int index = 0;
	for (int counter = 0; counter < scores.length; counter++){ 
	index = scores[counter];
	System.out.println(index+" ");
	}
	}
	



}