const prompt = require("prompt-sync")();
function myAge(){
	let userInput = " ";
	do {
	let user = prompt("Please enter your date of birth : ");
	userInput = user.replace(/[-/.;]/g, "");
	console.log(userInput);
	}while(userInput.length != 8);
	let userDay = userInput.substring(0,2);
	let day = parseInt(userDay);
	let userMonth = userInput.substring(2,4);
	let month = parseInt(userMonth);
	let userYear = userInput.substring(4,8);
	let year = parseInt(userYear);
	let currentYear = new Date().getFullYear();
	let currentMonth = new Date().getMonth();
	let currentDay = new Date().getDate();
	let age = 0;
	if (currentDay < day || currentMonth < month){
		age = currentYear - year - 1;
	}else{
		age = currentYear - year;
	}
		let yourAge = String(age);
	
	console.log(age);

}
myAge();