package Computer;

import javax.swing.JOptionPane;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();

        int emitBeepOption = JOptionPane.showConfirmDialog(null, "Does the computer emit a beep when starting?", "Beep Emission", JOptionPane.YES_NO_OPTION);
        boolean emitsBeep = (emitBeepOption == JOptionPane.YES_OPTION);
        computer.setEmitsBeep(emitsBeep);

        int hardDriveSpinOption = JOptionPane.showConfirmDialog(null, "Does the hard drive spin?", "Hard Drive Spin", JOptionPane.YES_NO_OPTION);
        boolean hardDriveSpins = (hardDriveSpinOption == JOptionPane.YES_OPTION);
        computer.setHardDriveSpins(hardDriveSpins);

        String computerStateMessage = computer.determineComputerState();
        JOptionPane.showMessageDialog(null, computerStateMessage);
    }
}
