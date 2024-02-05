package WashingMachine;

public class WashingMachine {
    private int largeWashingMachine;
    private int smallWashingMachine;

    public int getLargeWashingMachine() {
        return largeWashingMachine;
    }

    public void setLargeWashingMachine(int largeWashingMachine) {
        this.largeWashingMachine = largeWashingMachine;
    }

    public int getSmallWashingMachine() {
        return smallWashingMachine;
    }

    public void setSmallWashingMachine(int smallWashingMachine) {
        this.smallWashingMachine = smallWashingMachine;
    }

    public double calculateCost() {
        int rentalHours = largeWashingMachine + smallWashingMachine;
        double totalCost = 0.0;


        double largeWashingMachineRate = 4000.0;
        double smallWashingMachineRate = 3000.0;


        double costWithoutDiscount = (largeWashingMachine * largeWashingMachineRate + smallWashingMachine * smallWashingMachineRate) * rentalHours;

        if (largeWashingMachine + smallWashingMachine > 3) {
            double discount = 0.03 * costWithoutDiscount;
            totalCost = costWithoutDiscount - discount;
        } else {
            totalCost = costWithoutDiscount;
        }

        return totalCost;
    }
}
