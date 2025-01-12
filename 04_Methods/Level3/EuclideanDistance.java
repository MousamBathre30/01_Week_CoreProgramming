import java.util.Scanner;

public class EuclideanDistance {

    // Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(int x1, int y1, int x2, int y2) {
        // Euclidean distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to find the equation of the line formed by two points
    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double[] equation = new double[2]; // Array to store slope and y-intercept
        
        // Calculate the slope: m = (y2 - y1) / (x2 - x1)
        double m = (double)(y2 - y1) / (x2 - x1);
        
        // Calculate the y-intercept: b = y1 - m*x1
        double b = y1 - m * x1;
        
        // Store slope and intercept in the array
        equation[0] = m;  // slope
        equation[1] = b;  // y-intercept
        
        return equation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take inputs for two points
        System.out.println("Enter coordinates for Point 1 (x1, y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        
        System.out.println("Enter coordinates for Point 2 (x2, y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        // Calculate the Euclidean distance between the points
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between the points is: " + distance);
        
        // Find the equation of the line passing through the points
        double[] equation = findLineEquation(x1, y1, x2, y2);
        
        // Display the equation of the line
        System.out.println("The equation of the line is: y = " + equation[0] + "x + " + equation[1]);
    }
}
