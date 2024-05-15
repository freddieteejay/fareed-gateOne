const prompt = require("prompt-sync")();
let contacts = []

function addContact(){
let firstName = prompt("Enter first name: ");
let lastName = prompt("Enter last name: ");
let phoneNumber = prompt("Enter phone number: ");
contacts.push([firstName, lastName,phoneNumber]);
console.log("contact saved successfully ");
}

function removeContact(){
let phoneNumber = prompt("Enter number you would like to remove");
	for (let count = 0; count < contacts.length; count++){
		if (contacts[count][2] === phoneNumber){
			contacts.splice(I,1)
			console.log("Contact removed successfully");
			return;
		}
	}
	console.log("Contact not found");


function findNumberByPhoneNumber(){
let phoneNumber = prompt("Enter number that you want to search: ");
	for(let count = 0; count < contacts.length;count++){
		if (contacts[count][2]=== phoneNumber){
			console.log(`Contact name: ${contacts[count][0]} ${contacts[count][1]}`);
			console.log(`Phone number: ${contacts[count][2]}`);
			return;
		}
	}
			console.log("Contact not found");
}

function findContactByFirstName(){
let firstName = prompt("Enter first name you want to search: ");
	for(let count =0; count < contacts.length; count++){
		if (contacts[count][0] === firstName){
			console.log(`Contact name: ${contacts[count][0]}  ${contacts[count][1]}`);
			console.log(`Phone number: ${contacts[count][2]}`);
			return;
		}
	}
			console.log(Contact not found);
}

function findContactByLastName(){
let lastName  = prompt("Enter last name you want to search: ");
	for (let count = 0; count < contacts.length; count++){
		if(contacts[count][1] === lastName){
			console.log(`Contact name: ${contacts[count][0]} ${contacts[count][1]}`);
			console.log(`Phone number: ${cotacts[count][2]}`);
			return;
		}
	}
			console.log(Contact not found);
}

function editContacts(){
let oldCon = prompt("Enter number you want to edit: ");
	for (let count = 0; count < contacts.length; count++){
		if(contacts[counts][2] === oldCon){
			let newFirstName = prompt("Enter the new name: ");
			let newLastName = prompt("Enter the new last name: ");
			let newNumber = prompt("Enter the new phone number: ");
			contacts[count][0] = newFirstName;
			contacts[count][1] = newLastName;
			contacts[count][2] = newNUmber;
			console.log("contact edited successfully!!!");
			return;
		}
	}
		
			console.log(Contact not found);


}

While (true){
console.log("1. Add contact");
console.log("2. remove contact");
console.log("3. find contact by phone number");
console.log("4. find contact by first name");
console.log("5. find contct by last name");
console.log("6. edit contact");
console.log("7. Exit");
let userInput = prompt("Choose an option: ");

if (userInput === "1"){
addContact();
}
if (userInput === "2")





}


















}