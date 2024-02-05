package MedicalAppointment;
import User.User;

import java.util.Scanner;

public class MainAppointment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Appointment appointment = null;

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Create appointment");
            System.out.println("2. View appointment details");
            System.out.println("3. Change appointment time");
            System.out.println("4. Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    appointment = createAppointment(scanner);
                    break;
                case 2:
                    if (appointment != null) {
                        appointment.viewAppointmentDetails();
                    } else {
                        System.out.println("No appointment has been created.");
                    }
                    break;
                case 3:
                    if (appointment != null) {
                        changeTime(scanner, appointment);
                    } else {
                        System.out.println("No appointment has been created.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close(); // Close the Scanner before exiting
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }

    public static Appointment createAppointment(Scanner scanner) {
        Appointment appointment = new Appointment();

        System.out.println("Enter the appointment code:");
        appointment.appointmentCode = scanner.nextInt();

        System.out.println("Enter the appointment date: ");
        appointment.date = scanner.nextInt();

        System.out.println("Enter the appointment time: ");
        appointment.time = scanner.nextInt();

        System.out.println("Enter the office for the appointment: ");
        appointment.office = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter the doctor's name:");
        appointment.doctorName = scanner.nextLine();

        System.out.println("Enter the patient's name:");
        appointment.patientName = scanner.nextLine();

        System.out.println("Enter the medical center's name:");
        appointment.medicalCenter = scanner.nextLine();

        System.out.println("Appointment created successfully.");
        return appointment;
    }

    public static void changeTime(Scanner scanner, Appointment appointment) {
        System.out.println("Enter the new appointment time: ");
        int newTime = scanner.nextInt();
        appointment.changeTime(newTime);
    }
}

