package PatternPrinting;

import java.util.Scanner;

public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*" + " ");

                    else
                    System.out.print("  ");//2 spaces



                }
                System.out.println();
            }
            sc.close();
        }
    }


