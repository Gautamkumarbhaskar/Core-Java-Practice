package Arrays;

import java.util.Scanner;

public class GcdRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the A number: ");
        int a = sc.nextInt();

        System.out.println("Enter the B number: ");
        int b = sc.nextInt();

        findGCD(a, b);


    }

    public static void findGCD(int a, int b) {
        if (b == 0) {
            System.out.println("GCD: " + a);
        } else {
            int temp = b;
            b = a % b;
            a = temp;

            findGCD(a, b);
        }
    }
}