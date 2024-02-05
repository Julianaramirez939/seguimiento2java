package CeluMovil;
import javax.swing.JOptionPane;

public class CeluMovil {
    private String operator;
    private int internationalMinutes;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getInternationalMinutes() {
        return internationalMinutes;
    }

    public void setInternationalMinutes(int internationalMinutes) {
        this.internationalMinutes = internationalMinutes;
    }

    public double calculateCost() {
        double fixedCharge = 0;
        double internationalMinuteRate = 0;
        double dataPackageValue = 0;

        switch (operator.toLowerCase()) {
            case "tigo":
                fixedCharge = 45000;
                internationalMinuteRate = 200;
                dataPackageValue = 12000;
                break;
            case "claro":
                fixedCharge = 30000;
                internationalMinuteRate = 100;
                dataPackageValue = 18000;
                break;
            case "movistar":
                fixedCharge = 40000;
                internationalMinuteRate = 250;
                dataPackageValue = 8000;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid operator.");
                return 0;
        }

        double internationalCallCost = internationalMinutes * internationalMinuteRate;
        double totalCost = fixedCharge + internationalCallCost + dataPackageValue;

        return totalCost;
    }
}

