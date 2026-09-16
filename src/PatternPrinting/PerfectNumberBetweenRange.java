package PatternPrinting;

import java.util.Scanner;

public class PerfectNumberBetweenRange {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Starting Number");
        int n=sc.nextInt();
        System.out.println("Enter a Ending Number");
        int m=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;


            }
            if (sum==n)
            System.out.print(n);




        }


    }
}
