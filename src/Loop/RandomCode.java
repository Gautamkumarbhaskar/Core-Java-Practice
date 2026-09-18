package Loop;

import java.util.Random;
import java.util.Scanner;

public class RandomCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter a number between 0 to 9");
            n = scan.nextInt();
        } while( n <0 || n >9);

        Random random = new Random();
        int k = random.nextInt(10);
        if (n == k) {
            System.out.println("input number :  " + n);
            System.out.println("random number:  " + k);
            System.out.println("You have won the lottery");
        }
        else {
            System.out.println("input number :  " + n);
            System.out.println("random number:  " + k);
            System.out.println("You have lost the lottery");
        }
        scan.close();
    }
}


