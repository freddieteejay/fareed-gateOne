sumOfScores = 0
for counter in  range(0,10):
	userInput = int(input("Enter score : " ))
	if (userInput % 2 == 0):
		sumOfScores += userInput
print(sumOfScores)
