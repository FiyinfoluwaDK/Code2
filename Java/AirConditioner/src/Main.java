public class Main {
    public static void main(String[] args) {
        AC ac = new AC();
        int temperature = 25;

        System.out.println("Power Status: " + ac.powerCheck(true));
        System.out.println("Temperature: " + ac.displayTemperature(temperature));

        temperature = ac.increaseTemperature(temperature);
        System.out.println("Increased Temperature: " + ac.displayTemperature(temperature));

        temperature = ac.decreaseTemperature(temperature);
        System.out.println("Decreased Temperature: " + ac.displayTemperature(temperature));

        temperature = ac.temperatureRange(35);
        System.out.println("Adjusted Temperature (Out of Range): " + ac.displayTemperature(temperature));
    }
}
