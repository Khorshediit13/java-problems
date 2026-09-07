package knapsack.problem;

import java.util.Scanner;

public class KnapsackMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of items: ");
        int n = scanner.nextInt();

        Item[] items = new Item[n]; 

        for (int i = 0; i < n; i++) {
            System.out.println("Item " + (i + 1) + ":");
            System.out.print("  Enter Value: ");
            int val = scanner.nextInt();
            System.out.print("  Enter Weight: ");
            int wt = scanner.nextInt();

            items[i] = new Item(val, wt);
        }

        System.out.print("Enter knapsack capacity: ");
        int capacity = scanner.nextInt();

        KnapsackSolver solver = new KnapsackSolver();
        int maxProfit = solver.solve(capacity, items);

        System.out.println("\nMaximum Profit = " + maxProfit);

        scanner.close();
    }
}