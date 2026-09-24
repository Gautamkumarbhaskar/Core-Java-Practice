package PracticeQuestion;

import java.util.Scanner;

public class LargestThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  a value");
        int a = sc.nextInt();
        System.out.println("Enter the b value");
        int b = sc.nextInt();
        System.out.println("Enter the c value");
        int c  = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " is largest number");
        }
            else if (b >= c && b >= a) {
            System.out.println(b + " is the largest number");
        }
            else{
            System.out.println(c + " is the largest number");


        }



    }
}
