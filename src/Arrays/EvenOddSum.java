package Arrays;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = sc.nextInt();
        System.out.println("Enter the columns");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix [i][j] = sc.nextInt();
                matrix[i][j] = sc.nextInt();

            }
        }
        int even = 0;
        int odd = 0;
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++) {
                if (matrix[i][j] % 2 == 0)
                    even += matrix[i][j];

                else odd += matrix[i][j];


            }
            }
            System.out.println("Even Element Sum = "+even);
            System.out.println("Odd Element Sum = "+odd);
            sc.close();
        }
    }

