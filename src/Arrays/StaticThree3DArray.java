package Arrays;

public class StaticThree3DArray {
    public static void main(String[] args) {
        int[][][] arr = {
                {
                        {2, 1, 7},
                        {3, 0, 8}
                },
                {
                        {7, 1, 5},
                        {9, 6, 3}
                },
                {
                        {7, 6, 5},
                        {3, 2, 1}


                }
        };
        for (int i = 0; i < arr.length; i++) {  //depth loops
            for (int j = 0; j < arr[0].length; j++) { //rows loops
                for (int k = 0; k < arr[0][0].length; k++) { //cols loop
                    System.out.print(arr[i][j][k] + " ");

                }
            }


        }
    }
}
