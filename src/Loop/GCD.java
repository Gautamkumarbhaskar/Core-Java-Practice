package Loop;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int a = scan.nextInt();
        System.out.println("enter second number");
        int b = scan.nextInt();

        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD : " + a);
        scan.close();
    }
}




