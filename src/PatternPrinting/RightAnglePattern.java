package PatternPrinting;

import java.util.Scanner;

public class RightAnglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { //for rows
            for (int j = 1; j <= i; j++) { //for column
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
