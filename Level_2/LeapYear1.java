import java.util.Scanner;

public class LeapYear1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if year is greater than or equal to 1582 (Gregorian calendar)
        if (year >= 1582) {
            // Part 1: Using multiple if-else statements based on conditions
            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    System.out.println(year + " is a Leap Year.");
                } else if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }

            // Part 2: Using a single if statement with multiple logical conditions
            if ((year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                System.out.println(year + " is a Leap Year.");
            } else if (year >= 1582) {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Please enter a year >= 1582.");
        }

        scanner.close();
    }
}
