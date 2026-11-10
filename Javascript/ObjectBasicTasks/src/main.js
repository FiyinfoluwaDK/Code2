const student = {
    name: "John Doe",
    age: 20,
    subjects: ["Math", "Science", "History"],
    address: {
        street: "123 Elm St",
        city: "New York",
        state: "NY",
        zip: "12345"
    }
};

console.log("Student Name:", student.name);
console.log("Student second course:", student.subjects[1]);
console.log("Student Address zip code:", student.address.zip);

student.age = 23;
student.GPA = 3.8;

const bankAccount = {
    ownwer: "Alice",
    balance: 500,
    deposit: function (amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        else if (amount < 0) {
            console.log("Deposit amount must be positive.");
        }
    },
    withdraw: function (amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
        else {
            console.log("Invalid withdrawal amount.");
        }
    }
}

bankAccount.deposit(200);
bankAccount.withdraw(1000);
console.log(bankAccount.balance);

const inventory = {
    apples: 10,
    bananas: 5,
    orange: 8,
    mangos: 12
}

for (let count = 0; count < Object.keys(inventory).length; count++){
    console.log(Object.keys(inventory)[count], inventory[Object.keys(inventory)[count]]);
    
}

const company = {
    name: "Tech Solutions",
    location: "San Francisco",
    employees: [
        {
            name: "John Doe",
            position: "Software Engineer",
            salary: 75000
        },
        {
            name: "Jane Smith",
            position: "Product Manager",
            salary: 85000
        }
    ]
}