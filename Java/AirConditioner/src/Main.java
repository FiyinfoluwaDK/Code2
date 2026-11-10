import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AC ac = new AC();
        int temperature = 25;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Powering ON the AC...");
        while (ac.powerCheck(true)) {

            System.out.println("""
                    =======================
                    1. Display Temperature
                    2. Increase Temperature
                    3. Decrease Temperature
                    4. Power OFF the AC
                    =======================
                    """);

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.println("Current Temperature: " + ac.displayTemperature(temperature) + "°C");
                }
                case "2" -> {
                    temperature = ac.increaseTemperature(temperature);
                    System.out.println("Temperature Increased to: " + temperature + "°C");
                }
                case "3" -> {
                    temperature = ac.decreaseTemperature(temperature);
                    System.out.println("Temperature Decreased to: " + temperature + "°C");
                }
                case "4" -> {
                    System.out.println("Powering OFF the AC...");
                    return;
                }
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
            scanner.close();
        }
    }
}