package DataType;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Value of A :");
        int a = sc.nextInt();
        System.out.println("Enter the value of B :");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Sum = " + c);
        int d = a - b;
        System.out.println("Difference = " + d);
        int e = a * b;
        System.out.println("Product = " + e);
        int f = a / b;
        System.out.println("Quotient = " + f);
        int g = a % b;




        System.out.println("Remainder = " + g);

    }
}
