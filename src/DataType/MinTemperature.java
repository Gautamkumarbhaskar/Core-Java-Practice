package DataType;

import java.util.Scanner;

public class MinTemperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature 1");
        int a = sc.nextInt();
        System.out.println("Enter Temperature 2");
        int b = sc.nextInt();
        int min = a<b ? a:b;
        System.out.println("Lowest Temperature" + min);
    }
}
