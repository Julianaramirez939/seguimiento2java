package MedicalAppointment;

public class Appointment {
    public int appointmentCode;
    public int date;
    public int time;
    public int office;
    public String doctorName;
    public String patientName;
    public String medicalCenter;

    public void viewAppointmentDetails() {
        System.out.println("Appointment Code: " + appointmentCode);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Office: " + office);
        System.out.println("Doctor: " + doctorName);
        System.out.println("Patient: " + patientName);
        System.out.println("Medical Center: " + medicalCenter);
    }

    public void changeTime(int newTime) {
        time = newTime;
        System.out.println("Appointment time updated successfully.");
    }
}
