import java.util.Scanner;

public class GradeCalculator3Subject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mark for subject 1: ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter mark for subject 2: ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter mark for subject 3: ");
        int mark3 = scanner.nextInt();

        int totalMarks = mark1 + mark2 + mark3;
        double averageMarks = (double) totalMarks / 3;

        char grade;

        if (averageMarks >= 90) {
            grade = 'A';
        } else if (averageMarks >= 80) {
            grade = 'B';
        } else if (averageMarks >= 70) {
            grade = 'C';
        } else if (averageMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average marks: " + averageMarks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}