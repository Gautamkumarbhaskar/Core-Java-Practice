package Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13, 45, 9, 25, 8};
        System.out.println("The array elements before sorting : ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "   ");


        bubbleSort(arr);

        System.out.println();
        System.out.println("The array elements after sorting : ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "   ");
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }



    }


}






