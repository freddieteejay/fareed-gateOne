sumOfScores = 0
averageScores = 0
for counter in range(1,11):
	userInput = int(input("Enter score : " ))
	sumOfScores += userInput
	averageScores = sumOfScores / counter
	
print(f"The total sum is : {sumOfScores}")
print(f"The average score is : {averageScores}")
