let scores = [];

const prompt = require("prompt-sync")();
for(let counter = 0; counter < 10; counter++){
	score = prompt("enter scores : ")
			scores.push( score);
}
console.log(scores);