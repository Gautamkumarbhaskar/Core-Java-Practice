package Arrays;



import java.util.Scanner;

public class MaxConsecutiveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        findmaxConsecutiveElement(arr);

    }

    private static void findmaxConsecutiveElement(int[] arr) {
        int count = 1;
        int max = 1;
        int element = arr[0];
        int n = arr.length;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
                element = arr[i];
            }
        }
        System.out.println("Element : " + element);
        System.out.println("Max consecutive repeated times :" + max);
    }
}
