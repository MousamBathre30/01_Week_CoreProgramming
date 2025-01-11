import java.util.Scanner;

public class MarksGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for Physics, Chemistry, and Maths
        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();
        System.out.print("Enter marks for Maths: ");
        double maths = scanner.nextDouble();

        // Calculate total and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100; // Assuming each subject has a maximum of 100 marks

        // Determine grade and remarks
        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4: Above agency-normalized standard";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3: At agency-normalized standard";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2: Below but appropriate agency-normalized standard";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1: Well below agency-normalized standard";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1: Too below agency-normalized standard";
        } else {
            grade = "R";
            remarks = "Remedial standard";
        }

        // Display the results
        System.out.println("\n--- Result ---");
        System.out.printf("Average Marks: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}
