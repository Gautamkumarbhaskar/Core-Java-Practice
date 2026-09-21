package PatternPrinting;

import java.util.Scanner;

public class HalfDiamond {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();

        //upper half row
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
        //lower half
        for(int i=n-1;i>1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
