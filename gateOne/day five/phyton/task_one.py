def validator():
	user_input = " "
	while len(user_input) != 16:
		user = input("Enter the card number u want to validate : ")
		user_input  = user.replace("-","")
	if user_input[0]== '4' or user_input[0]== '5' or user_input[0]== '6':
			print(user_input[0],end="")
			print(user_input[1],end="")
			print(user_input[2],end="")
			print(user_input[3]+"-",end="")
			print(user_input[4],end="")
			print(user_input[5],end="")
			print(user_input[6],end="")
			print(user_input[7]+"-",end="")
			print(user_input[8],end="")
			print(user_input[9],end="")
			print(user_input[10],end="")
			print(user_input[11]+"-",end="")
			print(user_input[12],end="")
			print(user_input[13],end="")
			print(user_input[14],end="")
			print(user_input[15]+".",end="")
			print("\nYour credit card is valid")
	else:
		print("Your card is invalid")
validator()