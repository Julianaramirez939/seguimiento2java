package User;
import java.util.Scanner;


public class MainUser {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);

        user.systemState = true;
        user.baseUsername = "Juliana";
        user.basePassword = 1091;

        System.out.println("Enter the username: ");
        user.enteredUsername = scanner.next();

        System.out.println("Enter the password: ");
        user.enteredPassword = scanner.nextInt();

        System.out.println("The state is: " + (user.validateState() ? "Active" : "Inactive"));
        System.out.println("Access is: " + (user.allowAccess().equals("Correct") ? "Granted" : "Denied"));

        scanner.close();
    }
}


