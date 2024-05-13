import java.util.*;
public class PhoneBook{
	public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Welcome to My phone book");
	String prompt = "1. Add contact\n" +
                "2. Remove contact\n" +
                "3. Find contact by phone number\n" +
                "4. Find contact by first name\n" +
                "5. Find contact by last name\n" +
                "6. Edit contact";
	System.out.println(prompt);
	int input = scanner.nextInt();
	
	ArrayList<String> contactName = new ArrayList<String>();
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
			decision = scanner.nextLine();
			}while(decision.equalsIgnoreCase("yes"));
	}
	

	}




	}
}