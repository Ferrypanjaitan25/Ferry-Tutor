package Driver;

import java.util.Scanner;
import Model.*;

public class DriverVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        System.out.println("Choose vehicle (0: Car, 1: Motorcycle): ");
        int choice = scanner.nextInt();

        if (choice == 0) {
            driveVehicle(car);
        } else if (choice == 1) {
            driveVehicle(motorcycle);
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    private static void driveVehicle(Vehicle vehicle) {
        vehicle.drive();
    }
}
