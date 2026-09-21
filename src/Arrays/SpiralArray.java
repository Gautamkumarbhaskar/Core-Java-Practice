package Arrays;

import java.util.ArrayList;
public class SpiralArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 5, 9, 6},
                {1, 7, 0, 3},
                {4, 5, 6, 7},
                {0, 9, 8, 7},
                {1, 2, 3, 4}
        };
        printSpiral(matrix);
    }
    private static void printSpiral(int[][] matrix) {
        //rows
        int n = matrix.length;
        //column
        int m = matrix[0].length;
        int top = 0;
        int left= 0;
        int right= m-1;
        int bottom= n-1;

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (top <= bottom && left <= right){
            //1st loop : left to right
            for(int i = left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            //2nd loop : top to bottom
            for (int i = top;i<=bottom;i++){
                list.add(matrix[i][right]);

            }
            right--;

            //3rd loop : right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
                //4th loop:bottom to loop
                if (left <= right){
                    for (int i = bottom; i >= top; i--){
                        list.add(matrix[i][left]);
                    }
                    left++;
                }
            } //end of while
            System.out.println(list);
        }



    }


