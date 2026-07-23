package DSASeries.TwoDimensionalArray;

import java.util.Scanner;

public class outputTwoDemArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaration or memory allocation
        int[][] arr = new int[2][3];

        // input of 2D Array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

        // output of 2D array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}
