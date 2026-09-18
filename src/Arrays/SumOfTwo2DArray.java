package Arrays;

import java.util.Scanner;

public class SumOfTwo2DArray {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row1");
        int r1 = sc.nextInt();
        System.out.println("Enter the column1");
        int c1 = sc.nextInt();
        System.out.println("enter the row2");
        int r2 = sc.nextInt();
        System.out.println("Enter the column2");
        int c2 = sc.nextInt();

        int[][] matrix = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];
        int[][] results = new int[r1][c1];

        if (r1 == r2 && c1 == c2) {

        System.out.println("enter the element 1");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("enter the element 2");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();

            }
        }
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    results[i][j] = matrix[i][j] + matrix2[i][j];
                }

            }
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(results[i][j] + " ");
                }
                System.out.println();
            }

            }
            else {
                System.out.println("not found");
           }

      }

   }
