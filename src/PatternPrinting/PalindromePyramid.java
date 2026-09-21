package PatternPrinting;

import java.util.Scanner;

public class PalindromePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //print leading spaces
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            //print increasing number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            //print decreasing number
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
