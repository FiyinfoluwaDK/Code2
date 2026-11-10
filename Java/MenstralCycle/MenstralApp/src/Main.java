package MenstralApp.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Welcome to the MenstralApp!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of your menstrual cycle (in days): ");

        int cycleLength = scanner.nextInt();
        MenstrualCycle cycle = new MenstrualCycle(cycleLength);
}
