package Loop;

import java.util.Scanner;
public class SumOfDigit {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter n value");
            int n = scan.nextInt();
            int sum = 0;

            while(n != 0) {
                int lastDigit = n % 10;
                sum += lastDigit;
                n = n / 10;
            }
            System.out.println("sum of digits = " + sum);
            scan.close();
        }
    }


