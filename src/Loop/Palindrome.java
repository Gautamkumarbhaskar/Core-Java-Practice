package Loop;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n value");
        int n = scan.nextInt();

        int temp = n;
        int reverse = 0;
        while(n >0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }

        if(reverse == temp)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a Palindrome number");
        scan.close();
    }
}


