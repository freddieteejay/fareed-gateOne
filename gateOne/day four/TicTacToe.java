import java.util.*;
public class TicTacToe{
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);

	String [] spaceOne = new String[1];
	String [] spaceTwo = new String[1];
	String [] spaceThree = new String[1];
	String [] spaceFour = new String[1];
	String [] spaceFive = new String[1];
	String [] spaceSix = new String[1];
	String [] spaceSeven = new String[1];
	String [] spaceEight = new String[1];
	String [] spaceNine = new String[1];

	for(int counter = 0; counter < 9; counter++){
	int index = 0;
	String temp;
	String userInput1;
	System.out.println("Enter x or o ");
		 userInput1 = scanner.next();
		temp = userInput1;
	if (userInput1 == temp){
		System.out.print("wrong input");
		}
		System.out.print(" ");
	System.out.println("Which place would you like it to be from (1 - 9) : ");
		int userInput = scanner.nextInt();
		if (userInput == 1){
			spaceOne[0] = userInput1;
		}
		else if (userInput == 2){
			spaceTwo[0] = userInput1;
		}
		else if (userInput == 3){
			spaceThree[0] = userInput1;
		}
		else if (userInput == 4){
			spaceFour[0] = userInput1;
		}
		else if (userInput == 5){
			spaceFive[0] = userInput1;
		}
		else if (userInput == 6){
			spaceSix[0] = userInput1;
		}
		else if (userInput == 7){
			spaceSeven[0] = userInput1;
		}
		else if (userInput == 8){
			spaceEight[0] = userInput1;
		}
		else if (userInput == 9){
			spaceNine[0] = userInput1;
		}
		else {
			System.out.print("invalid number");
			}
	

	}
	String result1 = Arrays.toString(spaceOne);
	String result2 = Arrays.toString(spaceTwo);
	String result3 = Arrays.toString(spaceThree);
	String result4 = Arrays.toString(spaceFour);
	String result5 = Arrays.toString(spaceFive);
	String result6 = Arrays.toString(spaceSix);
	String result7 = Arrays.toString(spaceSeven);
	String result8 = Arrays.toString(spaceEight);
	String result9 = Arrays.toString(spaceNine);
	

	System.out.print(result1);
	System.out.print(result2);
	System.out.print(result3);
	System.out.print("\n"+result4);
	System.out.print(result5);
	System.out.print(result6);
	System.out.print("\n"+result7);
	System.out.print(result8);
	System.out.print(result9);



	}
}
// let the user only be able to enter x or o once if the user enter x more than once 
