const prompt = require("prompt-sync")();
for (let counter = 0; counter < 5; counter++){ 

	const randomNumber1 = Math. floor(Math. random() * 10) + 1; 


	const randomNumber2 = Math. floor(Math. random() * 10) + 1; 
	let userInput1 = prompt(randomNumber1,"x",randomNumber2);

	let userInput2 = prompt(randomNumber1,"+",randomNumber2);
}