package PracticeQuestion;

import java.util.Scanner;

public class DivisibleBy5or11 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        if (n % 5==0) {
            System.out.println(n + " it is divisible by 5 ");
        }
            else if (n % 11 == 0) {
            System.out.println(n + " it is  divisible by 11 ");
        }
            else{
            System.out.println("it is not divisible by 5 and 11");

        }
    }
}
