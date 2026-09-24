package DataType;

import java.util.Scanner;

public class Evennumber {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();


        while (n>0){
            int lastdigit = n%10;
            if(lastdigit % 2==0){
                System.out.print(lastdigit + " ");
            }
               n = n/10;
        }

    }
}
