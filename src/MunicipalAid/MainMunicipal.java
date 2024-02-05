package MunicipalAid;

import javax.swing.JOptionPane;

public class MainMunicipal {
    public static void main(String[] args) {
        MunicipalAid municipalAid = new MunicipalAid();


        String gender = JOptionPane.showInputDialog(null, "Enter gender (female/male):");
        municipalAid.setGender(gender);


        String ageString = JOptionPane.showInputDialog(null, "Enter age:");
        int age = Integer.parseInt(ageString);
        municipalAid.setAge(age);


        int aid = municipalAid.calculateAid();
        JOptionPane.showMessageDialog(null, "The monthly received amount is: $" + aid);
    }
}
