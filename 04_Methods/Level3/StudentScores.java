import java.util.Random;

public class StudentScores {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateStudentScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];  // 2D array for Physics, Chemistry, and Math scores

        for (int i = 0; i < numStudents; i++) {
            // Generate random scores between 40 and 99 for each subject
            scores[i][0] = random.nextInt(60) + 40; // Physics
            scores[i][1] = random.nextInt(60) + 40; // Chemistry
            scores[i][2] = random.nextInt(60) + 40; // Math
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalsAveragesPercentages(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4]; // 2D array for Total, Average, Percentage, and Total marks

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Calculate total marks
            double average = total / 3.0; // Calculate average marks
            double percentage = (total / 300.0) * 100; // Calculate percentage

            // Store total, average, and percentage, rounding to 2 decimal places
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }

        return results;
    }

    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] results, int numStudents) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < numStudents; i++) {
            System.out.print((i + 1) + "\t");
            // Display PCM scores and calculated results (Total, Average, and Percentage)
            System.out.print(scores[i][0] + "\t\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t\t");
            System.out.print(results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\n");
        }
    }

    public static void main(String[] args) {
        // Input the number of students
        int numStudents = 5; // For example, we take 5 students

        // Generate random PCM scores for students
        int[][] scores = generateStudentScores(numStudents);

        // Calculate totals, averages, and percentages for each student
        double[][] results = calculateTotalsAveragesPercentages(scores, numStudents);

        // Display the scorecard
        displayScorecard(scores, results, numStudents);
    }
}
