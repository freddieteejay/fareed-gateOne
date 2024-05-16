import java.util.*;
public class PhoneBook{
	private static ArrayList<String[]> contacts = new ArrayList<>();
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		while (true){
			System.out.println("1. Add contact");
			System.out.println("2. Remove contact");
			System.out.println("3. find contact by phone number");
			System.out.println("4. find contact by first name");
			System.out.println("5. find contact by last name");
			System.out.println("6. Edit contact");
			System.out.println("7. Exit");
			System.out.print("Choose an option:");
			String userInput = scanner.next();
			switch (userInput){
			case "1":
				addContact();
				break;
			case "2":
				removeContact();
				break;
			case "3":
                    			findContactByPhoneNumber();
                   			 break;
			case "4":
                    			findContactsByFirstName();
                   			 break;
			case "5":
				findContactByLastName();
				break;
			case "6":
				editContact();
				break;
			case "7":
				System.exit(0);
			

			}
		}
	}
//Scanner scanner = new Scanner(System.in);
public static void addContact(){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter first name: ");
String firstName = scanner.next();
System.out.print("Enter last name: ");
String lastName = scanner.next();
System.out.print("Enter phone number: ");
String phoneNumber = scanner.next();
contacts.add(new String[] {firstName, lastName, phoneNumber});
System.out.println("Loading>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println(" ");
System.out.println("Contact added successfully");
System.out.println(" \n ");

}
public static void removeContact(){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter phone number to remove: ");
String phoneNumber = scanner.next();
for(int count = 0; count < contacts.size(); count++){
	if (contacts.get(count)[2].equals(phoneNumber)){
	contacts.remove(count);
	System.out.println("Contact removed sucessfully");
	return;
	}
	
}
System.out.println("Contact not found");
System.out.println(" \n ");
}
public static void findContactByPhoneNumber(){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter phone number to search");
String phoneNumber = scanner.next();
for (String[] contact : contacts) {
if (contact[2].equals(phoneNumber)) {
 System.out.println("contact name: " + contact[0]+" "+contact[1]);
 System.out.println("Phone number: " + contact[2]);
	System.out.println(" \n ");
	return;
            }
        }
System.out.println("Contact not found!");
	System.out.println(" \n ");
    }

public static void findContactsByFirstName(){
Scanner scanner = new Scanner(System.in);
	System.out.print("Enter firstName");
	String firstName = scanner.next();
	for (String[] contact : contacts){
		if (contact[0].equals(firstName)){
			System.out.println("Contact name: "+contact[0]+" "+contact[1]);
			System.out.println("Phone number: " +contact[2]);
			System.out.println(" \n ");
			return;
		}
		
	}
	System.out.print("contact not found");
	System.out.println(" \n ");
	}

public static void findContactByLastName(){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter last name to search: ");
String lastName = scanner.next();
for(String[] contact : contacts){
	if (contact[1].equals(lastName)){
		System.out.println("Contact name: "+contact[0]+" "+contact[1]);
		System.out.println("Phone number: " +contact[2]);
		System.out.println(" \n ");
		return;
	}
}
System.out.print("contact not found");
System.out.println(" \n ");

}
public static void editContact(){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter phone number you want to edit : ");
String phoneNumber = scanner.next();
for (int count = 0; count < contacts.size(); count++){
	if (contacts.get(count)[2].equals(phoneNumber)){
	System.out.println("Enter new First Name:");
	String newFirst = scanner.next();
	System.out.println("Enter new last Name:");
	String newLast = scanner.next();
	System.out.println("Enter new Phone number:");
	String newNumber = scanner.next();
	contacts.set(count, new String[]{newFirst, newLast, newNumber});
	System.out.println("Loading>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Contact edited succesfully");
	System.out.println(" \n ");
	return;
	}
	}
	System.out.println("contact not found");	
	

}






}