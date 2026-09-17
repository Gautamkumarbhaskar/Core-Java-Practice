package PatternPrinting;

import java.util.Scanner;
public class NumberBelowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            int temp = a;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp--;
            }
            a++;
            System.out.println();
        }


    }
}

