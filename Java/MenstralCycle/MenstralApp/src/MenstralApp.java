import java.util.Scanner;

public class MenstralApp {
    
    public int getCycleLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of your menstrual cycle (in days): ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String getLastPeriodDate() {
        System.out.print("Enter the date of your last period (YYYY-MM-DD): ");
        return scanner.nextLine();
    }

    public void displayNextPeriod(int cycleLength, String lastPeriodDate) {
        MenstrualCycle cycle = new MenstrualCycle(cycleLength);
        String nextPeriod = cycle.calculateNextPeriod(lastPeriodDate);
        System.out.println("Your next period is expected on: " + nextPeriod);
    }

    public String getOvulationDate(int cycleLength, String lastPeriodDate) {
        MenstrualCycle cycle = new MenstrualCycle(cycleLength);
        return cycle.calculateOvulationDate(lastPeriodDate);
    }
}
