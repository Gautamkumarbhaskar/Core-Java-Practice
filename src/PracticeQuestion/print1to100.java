package PracticeQuestion;

import java.util.Scanner;

public class print1to100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        System.out.println("print the number");
        for (int i=1;i<=n;i++){
            System.out.print(i+" ");

        }
    }
}
