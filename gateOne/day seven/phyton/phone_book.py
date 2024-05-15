contacts = []

def add_contact():
	first_name = input("Enter first name: ")
	last_name = input("Enter second name: ")
	phone_number = input('Enter phone number: ')
	contacts.append([first_name, last_name, phone_number])	
	print('Contact added successfully')
	print(' ')

def remove_contact():
	phone_number = input("Enter number you want to remove: ")
	for contact in contacts:
		if contact[2] == phone_number:
			contacts.remove(contact)
			print("Contact removed successfully")
			return
	print('contact not found')

def find_contact_by_phone_number():
	phone_number = input('Enter number you want to search: ')
	for contact in contacts:
		if contact[2] == phone_number:
			print(f"Contact name: {contact[0]} {contact[1]}")
			print(f"Phone number: {contact[2]}")
			return
		
	print("contact not found")

def find_contact_by_first_name():
	first_name = input("Enter the first name you want to search: ")
	for contact in contacts:
		if contact[0] == first_name:
			print(f'contact: {contact[0]} {contact[1]}')
			print(f"Phone number: {contact[2]}")
			return
	print("contact not found")

def find_contact_by_last_name():
	last_name = input("Enter the last name you want to search: ")
	for contact in contacts:
		if contact[1] == last_name:
			print(f"Contact name: {contact[0]} {contact[1]}")
			print(f'Phone number: {contact[2]}')
			return
	print("contact not found")

def edit_contact():
	old_num = input("Enter the number you want to edit: ")
	for contact in contacts:
		if contact[2] == old_num:
			new_first_name = input("Enter the new first name: ")
			new_last_name = input("Enter the new last name: ")
			new_number = input("Enter the new phone number: ")
			contact[0] = new_first_name
			contact[1] = new_last_name
			contact[2] = new_number
			print("contact edited successfully")
			return
	print("contact not found")

while True:
	print("1. Add contact")
	print("2. remove contact")
	print("3. find contact by phone number")
	print("4. find contact by first name")
	print("5. find contact by last name")
	print("6. Edit contact")
	print("7. Exit")
	user_input = input("Choose an option: ")

	if user_input == "1":
		add_contact()
	elif user_input == "2":
		remove_contact()
	elif user_input == "3":
		find_contact_by_phone_number()
	elif user_input == "4":
		find_contact_by_first_name()
	elif user_input == "5":
		find_contact_by_last_name()
	elif user_input == "6":
		edit_contact()
	elif user_input == "7":
		break

		


			
			
			




			

			