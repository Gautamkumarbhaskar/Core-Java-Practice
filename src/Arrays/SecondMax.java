package Arrays;

import java.util.Scanner;

public class SecondMax {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of the array : ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements of the array :");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Bina return ke seedha if-else
            if (n < 2) {
                System.out.println("Second max We have to write 2 element.");
            } else {
                int max = Integer.MIN_VALUE;
                int secondMax = Integer.MIN_VALUE;

                for (int num : arr) {
                    if (num > max) {
                        secondMax = max;
                        max = num;
                    } else if (num > secondMax && num != max) {
                        secondMax = num;
                    }
                }

                if (secondMax == Integer.MIN_VALUE) {
                    System.out.println("second maximum element not found.");
                } else {
                    System.out.println("Second Max: " + secondMax);
                }
            }

            sc.close();
        }
    }

