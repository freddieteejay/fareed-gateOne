import java.util.Scanner;
public class TaskOne{
public static void main(String[] args){
	validate();

}
	public static void  validate(){
	Scanner scanner = new Scanner(System.in);
		String userInput;
		 do{
			System.out.print("Enter card number you want to validate : ");
				String user = scanner.next(); 
				userInput = user.replace("-", "");
		}while(userInput.length() < 16 || userInput.length() > 16);

 
		if (userInput.charAt(0)== '4' || userInput.charAt(0)== '5' || userInput.charAt(0)== '6'){
			System.out.print(userInput.charAt(0));
			System.out.print(userInput.charAt(1));
			System.out.print(userInput.charAt(2));
			System.out.print(userInput.charAt(3)+"-");
			System.out.print(userInput.charAt(4));
			System.out.print(userInput.charAt(5));
			System.out.print(userInput.charAt(6));
			System.out.print(userInput.charAt(7)+"-");
			System.out.print(userInput.charAt(8));
			System.out.print(userInput.charAt(9));
			System.out.print(userInput.charAt(10));
			System.out.print(userInput.charAt(11)+"-");
			System.out.print(userInput.charAt(12));
			System.out.print(userInput.charAt(13));
			System.out.print(userInput.charAt(14));
			System.out.print(userInput.charAt(15)+".");


			System.out.print("\nYour credit card is valid");
		}else{
			System.out.print("Your credit card is invalid");
			}



	}
}