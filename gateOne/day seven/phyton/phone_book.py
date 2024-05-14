contacts = []

def add_contact():
	first_name = input("Enter first name: ")
	last_name = input("Enter second name: ")
	phone_number = input('Enter phone number: ')
	contacts.append([first_name, last_name, phone_number])	
	print('Contact added successfully')
	print(' ')
iiii
def remove_contact():
	phone_number = input("Enter number you want to remove: ")
	for contact in contacts:
		if contact[2] == phone_number:
			contacts.remove(contact)
			print("Contact removed sucessfully")
			return
	print('contact not found')
def findContactByPhoneNumber():
	phone_number = input('Enter number you want to: ')
	for contact in contacts:
		if contact[2] == phone_number:
			print(f"Contact name: {contact[0]} {contact[1]}")
			print(f"Phone number: {contact[2]}")
			return
		
	print("contact not found")

			