sumOfScores = 0;
averageScores = 0;
for counter in range(1,11):
	userInput = int(input("Enter score : " ))
	sumOfScores += userInput
	averageScores = sumOfScores / counter
print(averageScores)