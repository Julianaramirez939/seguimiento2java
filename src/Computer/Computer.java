package Computer;

public class Computer {
    private boolean emitsBeep;
    private boolean hardDriveSpins;

    public boolean isEmitsBeep() {
        return emitsBeep;
    }

    public void setEmitsBeep(boolean emitsBeep) {
        this.emitsBeep = emitsBeep;
    }

    public boolean isHardDriveSpins() {
        return hardDriveSpins;
    }

    public void setHardDriveSpins(boolean hardDriveSpins) {
        this.hardDriveSpins = hardDriveSpins;
    }

    public String determineComputerState() {
        if (emitsBeep && hardDriveSpins) {
            return "Contact technical support.";
        } else if (emitsBeep && !hardDriveSpins) {
            return "Check unit contacts.";
        } else if (!emitsBeep && !hardDriveSpins) {
            return "Bring the computer for repair at the center.";
        } else if (!emitsBeep && hardDriveSpins) {
            return "Check speaker connections.";
        } else {
            return "Invalid computer state.";
        }
    }
}
