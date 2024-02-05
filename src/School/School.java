package School;

public class School {
    public double physicsGrade;
    public double chemistryGrade;
    public double biologyGrade;
    public double mathematicsGrade;
    public double computerScienceGrade;

    public double calculateAverage() {
        return (physicsGrade + chemistryGrade + biologyGrade + mathematicsGrade + computerScienceGrade) / 5.0;
    }

    public void classifyGrade(double average) {
        if (average >= 0 && average < 6) {
            System.out.println("The grade is poor.");
        } else if (average >= 6 && average <= 8) {
            System.out.println("The grade is good.");
        } else if (average > 8 && average <= 10) {
            System.out.println("The grade is excellent.");
        } else {
            System.out.println("The average is out of range.");
        }
    }
}
