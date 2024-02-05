package User;

public class User {
    public String baseUsername;
    public String enteredUsername;
    public int basePassword;
    public int enteredPassword;
    public boolean systemState;

    public boolean validateState() {
        return this.systemState;
    }

    public String allowAccess() {
        if (this.baseUsername.equals(this.enteredUsername) && this.basePassword == this.enteredPassword) {
            return "Correct";
        } else {
            return "Error";
        }
    }
}

