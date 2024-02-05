package TrafficLight;

import java.util.Scanner;

public class MainTraffic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Traffic traffic = new Traffic();

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Change traffic light color");
            System.out.println("2. Turn on traffic light");
            System.out.println("3. Turn off traffic light");
            System.out.println("4. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter the new traffic light color:");
                    String newColor = scanner.nextLine();
                    traffic.changeColor(newColor);
                    break;
                case 2:
                    traffic.turnOn();
                    break;
                case 3:
                    traffic.turnOff();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}
