// Activity 4

import java.util.Scanner;
public class FuelMonitoringSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Predefined fuel limits (in liters)
        int reserveLevel = 500;
        int maxCapacity = 5000;
        // Accept current fuel level
        System.out.print("Enter current fuel level (in liters): ");
        int fuelLevel = sc.nextInt();
        // Generate alerts based on fuel level
        if (fuelLevel < reserveLevel) {
            System.out.println("ALERT: Fuel level is below reserve limit.");
            System.out.println("Action Required: Arrange refueling immediately.");
        }
        else if (fuelLevel >= reserveLevel && fuelLevel <= maxCapacity) {
            System.out.println("STATUS: Fuel level is within safe limits.");
            System.out.println("No immediate action required.");
        }
        else {
            System.out.println("WARNING: Fuel level exceeds maximum safe capacity.");
            System.out.println("Action Required: Prevent overflow and ensure safety.");
        }
        sc.close();
    }
}
