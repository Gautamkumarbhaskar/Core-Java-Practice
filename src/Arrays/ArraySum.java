package Arrays;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter Array Elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

        }
        System.out.println("Sum of Array Elements is "+sum);

    }
}
