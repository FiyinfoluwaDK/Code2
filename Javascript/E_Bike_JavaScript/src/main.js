const prompt = require('prompt-sync')();
console.log("Bike is ready to ride!");

const bike = new Bike();

bike.powerChecker();

let speed = 0;

while (bike.powerChecker()) {

    console.log(`
            ========Power is available=========
            1.  Accelerate
            2.  Brake
            3.  Headlights
            4.  Speed(Current Speed)
            5.  Gear(Current Gear)
            6.  Power Off
            ==================================`);

    let choice = prompt("Enter your choice: ");

    switch (choice) {
        case "1": {
            let initialSpeed = speed + 1;
            let gear = bike.gearSystem(initialSpeed);
            let newSpeed = bike.acceleratorRate(gear, initialSpeed);
            speed = newSpeed;
            if(speed > 30) {
                speed = bike.speedLimiter(speed);
            }
            console.log("Accelerated! Current Speed: " + newSpeed);
        }
        case "2": {
            if (bike.brake()) {
                speed = speed - 5;
                console.log("Braked! Current Speed: " + speed);
            } else {
                console.log("Brake is not working!");
            }
        }
        case "3": {
            if (bike.headlights()) {
                console.log("Headlights are ON!");
            } else {
                console.log("Headlights are not working!");
            }
        }
        case "4": {
            console.log("Current Speed: " + speed);
        }
        case "5": {
            let gear = bike.gearSystem(speed);
            console.log("Current Gear: " + gear);
        }
        case "6": {
            bike.powerOff();
            console.log("Power is OFF!");
        }
    }

}



