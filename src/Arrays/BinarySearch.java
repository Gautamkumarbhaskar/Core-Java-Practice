package Arrays;

import java.util.*;
// import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the key");
        int key = sc.nextInt();

        // sort the array
        Arrays.sort(arr);
        int low = 0, high = n - 1;
         boolean flag = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                high = mid - 1;
                flag = true;
                break;

            }
            else if (arr[mid] > key) {
                high = mid - 1;
            }
             else{
                 low = mid + 1;
            }
        }
        if(flag)
            System.out.println("Element is found " );
        else
            System.out.println("Element is not found");




    }
}
