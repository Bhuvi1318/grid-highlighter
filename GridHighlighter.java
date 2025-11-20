import java.util.Scanner;
import java.util.Random;

public class GridHighlighter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int n;

        // getting array size
        while (true) {
            System.out.print("Enter array size (for NxN array): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 1) {
                    break;
                } else {
                    System.out.println("Size must be greater than 1");
                }
            } else {
                System.out.println("Invalid input! Enter number only");
                sc.next(); 
            }
        }

        int arr[][] = new int[n][n];

        // filling array with random even numbers 2-20
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int even = (r.nextInt(10) + 1) * 2;
                arr[i][j] = even;
            }
        }

        // printing the array
        System.out.println("\nGenerated 2D array:\n");

        System.out.print("    ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%02d  ", i);
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("%02d  ", i);
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d  ", arr[i][j]);
            }
            System.out.println();
        }

        int x;

        // getting highlight number
        while (true) {
            System.out.print("\nEnter a number to highlight (even number 2-20): ");
            if (sc.hasNextInt()) {
                x = sc.nextInt();

                if (x >= 2 && x <= 20 && x % 2 == 0) {
                    break;
                } else {
                    System.out.println("Enter even number only between 2 and 20");
                }

            } else {
                System.out.println("Invalid input! Enter number only");
                sc.next();
            }
        }

        System.out.println("\nArray with " + x + " highlighted:\n");

        System.out.print("    ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%02d  ", i);
        }
        System.out.println();

        int count = 0;

        // printing highlighted array
        for (int i = 0; i < n; i++) {
            System.out.printf("%02d  ", i);
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == x) {
                    System.out.printf("[%02d] ", arr[i][j]);
                    count++;
                } else {
                    System.out.printf(" %02d  ", arr[i][j]);
                }
            }
            System.out.println();
        }

        System.out.println("\nNumber " + x + " appeared " + count + " time(s)");
    }
}
