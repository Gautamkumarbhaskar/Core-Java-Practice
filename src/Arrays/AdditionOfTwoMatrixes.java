package Arrays;

import java.util.Scanner;
public class AdditionOfTwoMatrixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row 1");
        int row1 = sc.nextInt();

        System.out.println("Enter the column 1");
        int column1 = sc.nextInt();

        System.out.println("Enter the row 2");
        int row2 = sc.nextInt();

        System.out.println("Enter the column 2");
        int column2 = sc.nextInt();

        int[][] matrix1 = new int[row1][column1];

        int[][] matrix2 = new int[row2][column2];

    }

}
