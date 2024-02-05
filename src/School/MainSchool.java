package School;

import java.util.Scanner;

public class MainSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();

        System.out.println("Enter the Physics grade:");
        school.physicsGrade = scanner.nextDouble();

        System.out.println("Enter the Chemistry grade:");
        school.chemistryGrade = scanner.nextDouble();

        System.out.println("Enter the Biology grade:");
        school.biologyGrade = scanner.nextDouble();

        System.out.println("Enter the Mathematics grade:");
        school.mathematicsGrade = scanner.nextDouble();

        System.out.println("Enter the Computer Science grade:");
        school.computerScienceGrade = scanner.nextDouble();

        double average = school.calculateAverage();

        System.out.println("The average is: " + average);
        school.classifyGrade(average);

        scanner.close();
    }
}
