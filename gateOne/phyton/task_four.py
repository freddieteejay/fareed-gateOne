sumOfScores = 0
for counter in range(1, 11):
	userInput = int(input("Enter score : " ))
	if (counter % 2 == 0):
		sumOfScores += userInput
print(f"The total sum is : {sumOfScores}")

