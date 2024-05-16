import java.util.Scanner;

public class StudentGrade {

public static void main(String...args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("How many students do you have? ");

		int numberOfStudent = scanner.nextInt();

		System.out.println("How many subject do they have? ");

		int numberOfSubject = scanner.nextInt();

		System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		System.out.print("Saved successsfully");

		System.out.println();
		
		int score = 0;

		int[][] scores = new int[numberOfStudent][numberOfSubject];



		for (int i = 0; i < numberOfStudent; i++) {

		for (int count = 0; count < numberOfSubject; count++) {

			System.out.println("Entering score for student" + (i + 1) + ":");
				
			System.out.println("Entering score for subject" + (count + 1) + ":" );

			int counter = 0;

			score = scanner.nextInt();

			scores[i][count] = (score);

			counter += 1;

			System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

			System.out.println("Saved successsfully");

		}
		}

			System.out.print("======================================================\nSTUDENT\t");

		for (int i = 0; i < numberOfSubject; i++) {
			System.out.printf("\tSUB%-4s", (i+1) + "");
		}

		System.out.print("\tTOT\tAVE\tPOS");

		System.out.print("\n=============================================================\n");

		for (int j = 0; j < scores.length; j++) {

		System.out.print("STUDENT" + (j+1));
		
		double total = 0; 

		double average = 0;

		for (int soh = 0; soh < numberOfSubject; soh++) {
		
		System.out.print("\t  " + scores[j][soh]);
		
		total += scores[j][soh];

		average = total / numberOfSubject;
		}

		System.out.printf("	%.2f" , total);

		System.out.printf("	%.2f" , average);

		System.out.println();

		}

		System.out.print("===============================================================");

		System.out.print("\n==============================================================\n");

	
}
}
