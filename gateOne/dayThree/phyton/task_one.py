import random
correct =[]
incorrect =[]
for counter in range(5):
	num = random. randint(1, 10)
	nums = random.randint(1, 10)
	
	first_calc = int(input(f"{num} x {nums} = "))
	if (first_calc == num * nums):
		correct.append(first_calc)
	else:
		incorrect.append(first_calc)
	second_calc = int(input(f"{num} + {nums} = "))
	if(second_calc == num + nums):
		correct.append(second_calc)
	else:
		incorrect.append(second_calc)
print(f"The total correct scores is {len(correct)}")
print(f"The total incorrect scores is {len(incorrect)}")
	
	
