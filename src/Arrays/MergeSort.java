package Arrays;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = { 3, 0, 9, 5, 2, 11 };

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }

    // Main mergeSort method
    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
// Find the middle point
            int mid = (left + right) / 2;

// Sort the first and second halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

// Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    // Merge two subarrays
    private static void merge(int[] array, int left, int mid, int right) {
// Sizes of subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

// Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

// Copy data
        for (int i = 0; i < n1; i++)
            L[i] = array[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = array[mid + 1 + j];

// Merge temp arrays
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                k++;
                i++;
            } else {
                array[k] = R[j];
                k++;
                j++;
            }
        }

// Copy remaining elements
        while (i < n1) {
            array[k] = L[i];
            k++;
            i++;
        }

        while (j < n2) {
            array[k] = R[j];
            k++;
            j++;
        }
    }
}


