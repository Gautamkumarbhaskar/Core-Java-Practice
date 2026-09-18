package Arrays;

import java.util.Scanner;

public class MultiplyOf2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  row 1");
        int r1 = sc.nextInt();
        System.out.println("Enter th column 1");
        int c1 = sc.nextInt();
        System.out.println("enter the row 2");
        int r2 = sc.nextInt();
        System.out.println("Enter the column 2");
        int c2 = sc.nextInt();

        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];
        int[][] product = new int[r1][c2];

        if (c1 == r2) {
            System.out.println("Enter the element 1");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    matrix1[i][j] = sc.nextInt();

                }
            }
            System.out.println("Enter the Element 2");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    matrix2[i][j] = sc.nextInt();

                }
            }
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < r2; k++) {
                        product[i][j] += matrix1[i][k] * matrix2[k][j];
                     }
                    }
            }
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                          System.out.print(product[i][j] + " ");
                    }
                    System.out.println();
                }

            }
                 else{
                System.out.println("array not found");

            }
        }


    }







