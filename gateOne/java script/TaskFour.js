const prompt = require("prompt-sync")();
let sumOfScores = 0;
		for (let counter = 0; counter < 10; counter++){
		let userInput = parseInt(prompt(`Enter score: ${counter +1}`), 10);
			if (counter % 2 == 0){
				sumOfScores += userInput;
			}
		}
	console.log(sumOfScores);
	
