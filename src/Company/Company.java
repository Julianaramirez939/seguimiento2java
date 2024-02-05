package Company;

public class Company {
    public String employeeName;
    public int normalRate = 30000;
    public int extraRate = 33000;
    public int hours;

    public void calculateSalary() {
        int normalHours = Math.min(hours, 10);
        int extraHours = Math.max(hours - 10, 0);

        int totalSalary = (normalHours * normalRate) + (extraHours * extraRate);

        System.out.println("Mr./Ms. " + employeeName +
                ", the number of hours worked is: " + hours +
                " and the salary is: " + totalSalary);
    }
}
