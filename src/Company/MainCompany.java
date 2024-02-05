package Company;

import java.util.Scanner;

public class MainCompany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company();

        System.out.println("Enter employee name:");
        company.employeeName = scanner.nextLine();

        System.out.println("Enter the number of hours worked:");
        company.hours= scanner.nextInt();

        company.calculateSalary();

        scanner.close();
    }
}

