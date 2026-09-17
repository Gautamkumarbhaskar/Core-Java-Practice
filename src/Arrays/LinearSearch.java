package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Key elements :");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }

            }
            if (found)
                System.out.println("Element found");
            else
                System.out.println("Element not found");
        }
    }


