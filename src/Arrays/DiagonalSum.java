package Arrays;

public class DiagonalSum {
    public static void main(String[] args) {
            int[][] matrix = {
                    {5, 1, 4},
                    {2, 8, 5},
                    {6, 0, 4}
            };
            int rows = matrix.length;
            int cols = matrix[0].length;

            int left = 0, right = 0;

            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    if(i==j) {
                        left += matrix[i][j];
                    }
                    if(i+j == rows-1) {
                        right += matrix[i][j];
                    }
                }
            }
            System.out.println("left diagonal sum = " + left);
            System.out.println("right diagonal sum = " + right);
        }
    }




