
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int k = (int) Math.sqrt(n);
        boolean isprime = true;

        for (int i = 2; i <= k; i++) {
            if (n % i == 0) {
                isprime = false;

                break;
            }

            }
            if(isprime==true)
                System.out.println("it is a prime number");
                else
                System.out.println("it is not a prime number");
            }

        }


