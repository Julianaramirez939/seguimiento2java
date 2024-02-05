package WashingMachine;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainWashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WashingMachine washingMachine = new WashingMachine();

        int option;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Select an option:\n1. Large washing machine\n2. Small washing machine\n3. Exit"));

            switch (option) {
                case 1:
                    int largeWashingMachine = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the quantity of large washing machines rented:"));
                    washingMachine.setLargeWashingMachine(largeWashingMachine);
                    break;
                case 2:
                    int smallWashingMachine = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the quantity of small washing machines rented:"));
                    washingMachine.setSmallWashingMachine(smallWashingMachine);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
                    break;
            }

        } while (option != 3);

        double totalCost = washingMachine.calculateCost();
        JOptionPane.showMessageDialog(null, "The total cost of washing machine rental is: $" + totalCost);

        scanner.close();
    }
}
