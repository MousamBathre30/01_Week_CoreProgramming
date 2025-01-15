import java.util.Random;

public class StudentScorecard {

    // Method to generate random 2-digit scores for PCM
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // PCM scores for each student
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(50) + 50; // Random score between 50-99
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateTotals(int[][] scores) {
        double[][] results = new double[scores.length][3]; // Total, average, percentage
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }
        return results;
    }

    // Method to calculate grade based on percentage
    public static char[] calculateGrades(double[][] results) {
        char[] grades = new char[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) {
                grades[i] = 'A';
            } else if (percentage >= 75) {
                grades[i] = 'B';
            } else if (percentage >= 50) {
                grades[i] = 'C';
            } else {
                grades[i] = 'F';
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, char[] grades) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-15s%-10s%n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("--------------------------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.0f%-10.2f%-15.2f%-10c%n", i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; // Number of students
        int[][] scores = generateScores(numStudents); // Generate PCM scores
        double[][] results = calculateTotals(scores); // Calculate totals, averages, and percentages
        char[] grades = calculateGrades(results); // Calculate grades
        displayScorecard(scores, results, grades); // Display the scorecard
    }
}
