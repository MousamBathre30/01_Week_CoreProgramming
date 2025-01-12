import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Ensure the year is >= 1582 (Gregorian calendar starts)
        if (year < 1582) {
            throw new IllegalArgumentException("The year must be greater than or equal to 1582.");
        }

        // Check leap year conditions
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
 
        scanner.close();
    }
}
