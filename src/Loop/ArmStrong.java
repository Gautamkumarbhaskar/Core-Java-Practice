package Loop;

import java.util.Scanner;

public class ArmStrong {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter n value");
            int n = scan.nextInt();

            int count = 0;
            int temp = n;

//count the number of digits
            while(temp >0) {
                temp /= 10;
                count++;
            }

            int sum = 0;
            int temp2 = n;
            while(temp2 >0) {
                int lastDigit = temp2 % 10;
                sum = sum + (int) Math.pow(lastDigit, count);
                temp2 /= 10;
            }

            if(sum==n)
                System.out.println("Armstrong number");
            else
                System.out.println("Not Armstrong number");

            scan.close();
        }
    }


