package PatternPrinting;

import java.util.Scanner;

public class Integerinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        if (a<0||b<0 ) {
            System.out.println("Wrong input");
        }
        else if (a==b) {
            System.out.println("product=" + (a*b));
        }
        else {
            System.out.println("sum = " + (a + b));
        }
    }
}
