package DataType;

import java.util.Scanner;
public class HighestScore {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Score 1: ");
        int a = sc.nextInt();
        System.out.println("Enter Score 2: ");
        int b = sc.nextInt();
        System.out.println("Enter Score 3: ");
        int c = sc.nextInt();
        int max = (a>b) ? a:b;
        max = (max>c) ? max:c;
        System.out.println("Highest Score : " + max);
    }

}
