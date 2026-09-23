package PatternPrinting;

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        if (count == 2)
            System.out.println("It is a prime");
            else
                System.out.println("it is not prime");
            }
        }




