package Arrays;

import java.util.LinkedHashSet;
import java.util.Scanner;
public class RemoveDuplicatesElement {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the array size:");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            removeDuplicates(arr);
            sc.close();
        }

        private static void removeDuplicates(int[] arr) {
            LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();

            for (int i = 0; i < arr.length; i++) {
                hashSet.add(arr[i]);
            }

            System.out.println("Array after removing duplicates: " + hashSet);
        }
    }

