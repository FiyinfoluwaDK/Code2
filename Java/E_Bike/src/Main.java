import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bike is ready to ride!");

        Scanner scanner = new Scanner(System.in);

        Bike bike = new Bike();

        bike.powerChecker();

        int speed = 0;

        while (bike.powerChecker()) {

            System.out.println("""
                    ========Power is available=========
                    1.  Accelerate
                    2.  Brake
                    3.  Headlights
                    4.  Speed(Current Speed)
                    5.  Gear(Current Gear)
                    6.  Power Off
                    ==================================""");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    int intialSpeed = speed + 1;
                    int gear = bike.gearSystem(intialSpeed);
                    int newSpeed = bike.acceleratorRate(gear, intialSpeed);
                    speed = newSpeed;
                    if(speed > 30) {
                        speed = bike.speedLimiter(speed);
                    }
                    System.out.println("Accelerated! Current Speed: " + newSpeed);
                }
                case 2 -> {
                    if (bike.brake()) {
                        speed = speed - 5;
                        System.out.println("Braked! Current Speed: " + speed);
                    } else {
                        System.out.println("Brake is not working!");
                    }
                }
                case 3 -> {
                    if (bike.headlights()) {
                        System.out.println("Headlights are ON!");
                    } else {
                        System.out.println("Headlights are not working!");
                    }
                }
                case 4 -> {
                    System.out.println("Current Speed: " + speed);
                }
                case 5 -> {
                    int gear = bike.gearSystem(speed);
                    System.out.println("Current Gear: " + gear);
                }
                case 6 -> {
                    bike.powerOff();
                    System.out.println("Power is OFF!");
                }
            }

        }
    scanner.close();
    }
    
}