package Triangle;

import javax.swing.JOptionPane;

public class MainTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        // Ask the user to input angles using JOptionPane
        String angle1String = JOptionPane.showInputDialog(null, "Enter the first angle:");
        int angle1 = Integer.parseInt(angle1String);
        triangle.setAngle1(angle1);

        String angle2String = JOptionPane.showInputDialog(null, "Enter the second angle:");
        int angle2 = Integer.parseInt(angle2String);
        triangle.setAngle2(angle2);

        String angle3String = JOptionPane.showInputDialog(null, "Enter the third angle:");
        int angle3 = Integer.parseInt(angle3String);
        triangle.setAngle3(angle3);

        // Check if the triangle is valid and display the result using JOptionPane
        boolean isValid = triangle.isValidTriangle();
        if (isValid) {
            JOptionPane.showMessageDialog(null, "The entered angles form a valid triangle.");
        } else {
            JOptionPane.showMessageDialog(null, "The entered angles do not form a valid triangle.");
        }
    }
}
