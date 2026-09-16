package Statements;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int count = 1;
        while (count <= 10){
            System.out.println(num + " * " +count +  " = " + (num* count));
            count++;

        }



    }
}
