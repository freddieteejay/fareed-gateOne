const prompt = require("prompt-sync")();
let sumOfScores = 0;
for (let counter = 1; counter < 10; counter++){
	let userInput = prompt("Enter scores");
	sumOfScores += userInput;
}
console.log(sumOfScores);