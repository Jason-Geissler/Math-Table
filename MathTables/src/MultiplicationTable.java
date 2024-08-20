import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of k (1 to 10): ");
        int k = scanner.nextInt();

        long startTime, endTime;

        // Iterative approach
        startTime = System.currentTimeMillis();
        System.out.println("Multiplication Table for k = " + k + ":");
        printFullBorder();
        iterativeMultiplicationTable(k);
        printFullBorder();
        endTime = System.currentTimeMillis();
        System.out.println("\nIterative approach total time: " + (endTime - startTime) + " milliseconds\n");

        // Recursive approach
        startTime = System.currentTimeMillis();
        System.out.println("Multiplication Table for k = " + k + ":");
        printFullBorder();
        recursiveMultiplicationTable(k, 1);
        printFullBorder();
        endTime = System.currentTimeMillis();
        System.out.println("Recursive approach total time: " + (endTime - startTime) + " milliseconds");

        scanner.close();
    }

    // Method to print full border
    public static void printFullBorder() {
        System.out.print("-------");
        for (int i = 1; i <= 10; i++) {
            System.out.print("-------");
        }
        System.out.println("---------");
    }

    // Iterative method to print multiplication table for a specific k
    public static void iterativeMultiplicationTable(int k) {
        for (int i = 1; i <= k; i++) {
            System.out.print("| ");
            System.out.printf("%2d ", i); // Print row number
            for (int j = 1; j <= 10; j++) {
                System.out.printf("|%4d   ", i * j);
            }
            System.out.println("|");
            if (i == k) {
                
            }
        }
    }

    // Recursive method to print multiplication table for a specific k
    public static void recursiveMultiplicationTable(int k, int i) {
        if (i > k) return;
        System.out.print("| ");
        System.out.printf("%2d ", i); // Print row number
        recursiveMultiplicationTableHelper(i, 1);
        System.out.println("|");
        if (i == k) {
        }
        recursiveMultiplicationTable(k, i + 1);
    }

    // Helper method for recursive multiplication table
    private static void recursiveMultiplicationTableHelper(int i, int j) {
        if (j > 10) return;
        System.out.printf("|%4d   ", i * j);
        recursiveMultiplicationTableHelper(i, j + 1);
    }
}
