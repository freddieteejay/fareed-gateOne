import datetime
def my_age():
	user_input = " "
	while len(user_input) != 8:
		user = input("Please enter your date of birth: ")
		user_input = user.replace(",", "").replace("-", "").replace(".", "").replace(";", "").replace(" ", "")
		user_day = user_input[:2]
		new_user_day = int(user_day)
		user_month = user_input[2:4]
		new_user_month = int(user_month)
		user_year = user_input[4:8]
		new_user_year = int(user_year)
		today = datetime.date.today()
		year = today.year
		month = today.month
		day = today.day
		age = " "
		if day < new_user_day or month < new_user_input:
			age = year - new_user_year - 1
		else:
			age = year - new_user_year
		print(f"You are {age} years old")
my_age()



