package PatternPrinting;

import java.util.Scanner;

public class BelowCharPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value ");
        int n = sc.nextInt();
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            char temp = ch;
            for (int j = 1; j <=i;j++){
                System.out.print(temp + " ");
                temp--;
            }
            ch++;
            System.out.println();
        }
    }
}
