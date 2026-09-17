package PatternPrinting;

import java.util.Scanner;

public class DiamondStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1 ; j <= 2*(n-1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();

            //lower loop
        }

        sc.close();

    }
}

