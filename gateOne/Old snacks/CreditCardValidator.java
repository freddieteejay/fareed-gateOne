import java.util.*;
public class CreditCardValidator{
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
		String cardType = null;
		String userInput;
		do{
		System.out.println("Enter the card number you would like to validate");
			userInput = scanner.next();
			}while(userInput.length() < 13 || userInput.length() > 16);	
			
			
				

				if (userInput.charAt(0) == '4'){
					cardType = "Visa Cards";
				}
				else if (userInput.charAt(0) == '5'){
					cardType = "MasterCard";
				}
				else if (userInput.charAt(0) == '3' && userInput.charAt(1) == '7'){
					cardType = "American Express Cards";
				}
				else if (userInput.charAt(0) == '6'){
					cardType = "Discover cards";
				}
				else {
					cardType = "invalid card";
				}
				
		int result = 0;
		int sum = 0;
		ArrayList <Integer> collect = new ArrayList<>();
		for (int count = userInput.length()-1; count >=0; count--){
			if (count % 2 == 0){
				int num = Integer.valueOf(String.valueOf(userInput.charAt(count)));
				result = num * 2;
				if (result > 9){
				int emp = result;
					int total = 0;
					while(emp > 0){
					total+=emp%10;
						emp/=10;
					}
				sum+=total;
				}else{
				sum += result;	
}
			}
		}
		int nom = 0;
		ArrayList <Integer> collec = new ArrayList<>();
		for (int count = userInput.length()-1; count >=0; count--){
			if (count % 2 != 0){
				int num = Integer.valueOf(String.valueOf(userInput.charAt(count)));
				nom += num;
				collec.add(nom);
			
			}
		}
		String decision;
		int validDetect = sum + nom;
		
			if (validDetect % 10 == 0){
				decision = "valid";
			}
			else{
				decision = "invalid";	
			}
		System.out.println("**Credit card Type : "+cardType);
		System.out.println("**Credit card number : "+userInput);
		System.out.println("**Credit cardDigit Length : "+userInput.length());
		System.out.println("**Credit Card Validity Status : "+decision);



	}


}