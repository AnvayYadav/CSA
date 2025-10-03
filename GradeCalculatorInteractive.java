import java.util.Scanner;

public class GradeCalculatorInteractive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for student's name (final not needed if input at runtime)
        System.out.print("Enter student's name: ");
        final String studentName = input.nextLine();

        // Ask for class name
        System.out.print("Enter class name: ");
        final String className = input.nextLine();

        // Ask for three test scores
        System.out.print("Enter first test score (0-100): ");
        int score1 = input.nextInt();

        System.out.print("Enter second test score (0-100): ");
        int score2 = input.nextInt();

        System.out.print("Enter third test score (0-100): ");
        int score3 = input.nextInt();

        // Calculate average
        double average = (score1 + score2 + score3) / 3.0;

        // Determine letter grade
        char letterGrade;
        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        // Print results
        System.out.println("\n--- Grade Report ---");
        System.out.println("Student: " + studentName);
        System.out.println("Class: " + className);
        System.out.println("Test Scores: " + score1 + ", " + score2 + ", " + score3);
        System.out.println("Average Score: " + average);
        System.out.println("Letter Grade: " + letterGrade);

        input.close();
    }
}
