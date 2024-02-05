package CeluMovil;
import javax.swing.JOptionPane;

public class MainCeluMovil {
    public static void main(String[] args) {
        CeluMovil celuMovil = new CeluMovil();

        String operator = JOptionPane.showInputDialog(null, "Enter the operator (Claro/Tigo/Movistar):");
        celuMovil.setOperator(operator);

        String internationalMinutesString = JOptionPane.showInputDialog(null, "Enter the number of international minutes consumed:");
        int internationalMinutes = Integer.parseInt(internationalMinutesString);
        celuMovil.setInternationalMinutes(internationalMinutes);

        double totalCost = celuMovil.calculateCost();
        JOptionPane.showMessageDialog(null, "The total cost is: $" + totalCost);
    }
}
