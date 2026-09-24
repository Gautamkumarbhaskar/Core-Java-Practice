package PracticeQuestion;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a value");
        int a = sc.nextInt();
        System.out.println("Enter the b value");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is largest number  ");
        } else if (b > a) {
            System.out.println(b + " is  a largest number ");
        } else {
            System.out.println("both are equals");

        }

    }
}

