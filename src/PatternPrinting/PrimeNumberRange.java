package PatternPrinting;

import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a start number");
        int n = sc.nextInt();
        System.out.println("Enter end number");
        int range = sc.nextInt();
        for (int i = n; i <= range; i++) {
            if (i > 1) {
                boolean flag = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(i + "");
                }

            }

        }
    }
}

