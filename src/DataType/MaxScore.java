package DataType;

import java.util.Scanner;

public class MaxScore {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Score A");
        int a = sc.nextInt();
        System.out.println("Enter Score B");
        int b = sc.nextInt();
        int max = a>b ? a:b;
        System.out.println("Higher Score "+ max);
    }
}
