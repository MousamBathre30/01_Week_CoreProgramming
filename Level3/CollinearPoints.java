import java.util.Scanner;

public class CollinearPoints {

    // Method to find if three points are collinear using slope formula
    public static boolean arePointsCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes for AB, BC, and AC
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);
        
        // Check if all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to find if three points are collinear using area of triangle formula
    public static boolean arePointsCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Area of triangle formula: area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        // Points are collinear if area is zero
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take inputs for three points
        System.out.println("Enter coordinates for Point A (x1, y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        
        System.out.println("Enter coordinates for Point B (x2, y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        System.out.println("Enter coordinates for Point C (x3, y3): ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        
        // Check collinearity using slope method
        if (arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using slope formula.");
        } else {
            System.out.println("The points are NOT collinear using slope formula.");
        }
        
        // Check collinearity using area method
        if (arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using area formula.");
        } else {
            System.out.println("The points are NOT collinear using area formula.");
        }
    }
}
