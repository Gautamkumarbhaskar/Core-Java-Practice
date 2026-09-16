package Arrays;
import java.util.Scanner;
public class SelectionSort {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of the Array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println( "Enter the elements of the array: :");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Selection Sort Logic
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

            System.out.println("Sorted Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            sc.close();
        }
    }


