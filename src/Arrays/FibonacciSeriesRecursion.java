package Arrays;

import java.util.Scanner;

public class FibonacciSeriesRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        printFibonacciSeries(n);
    }

    private static void printFibonacciSeries(int n) {
        if (n > 0) {
            long firstterm = 0;
            long secondterm = 1;

            System.out.print("Fibonacci Series: ");

            for (int i = 1; i <= n; i++) {
                System.out.print(firstterm + " ");

                long nextTerm = firstterm + secondterm;
                firstterm = secondterm;
                secondterm = nextTerm;
            }
            System.out.println();
        }
    }
}