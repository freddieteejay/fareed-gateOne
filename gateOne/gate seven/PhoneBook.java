import java.util.Scanner;
import java.util.ArrayList;
public class PhoneBook{
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	
	printPrompt();
	addContact();

	
	}
public void printPrompt(){
	String prompt = "1. Add contact\n" +
                "2. Remove contact\n" +
                "3. Find contact by phone number\n" +
                "4. Find contact by first name\n" +
                "5. Find contact by last name\n" +
                "6. Edit contact";

	System.out.print(prompt);
}
public static String addContact(String contact){
ArrayList<String> phoneBook = new ArrayList<String>();
	ArrayList<String> contactNumber = new ArrayList<String>();
	if (input == 1){
		String decision = " ";
		do{
			System.out.println("Enter contact name: ");
			String userName = scanner.next();
			contactName.add(userName);
			System.out.println("Enter contact number: ");
			String userNumber = scanner.next();
			contactName.add(userNumber);
			System.out.print("Do you want to enter another another contact (yes / no)");
			decision = scanner.next();
			}while(decision.equalsIgnoreCase("yes"));
	}
}
}
