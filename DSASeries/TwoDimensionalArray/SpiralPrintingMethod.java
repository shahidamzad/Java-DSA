package DSASeries.TwoDimensionalArray;

public class SpiralPrintingMethod {
    public static void print(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
    static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5}, {6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        print(arr);

        // spiral printing

        int m = arr.length;
        int n = arr[0].length;

        int minRow = 0 , maxRow = m-1 ;
        int minCol = 0 , maxCol = n-1 ;

        while (minRow <= maxRow && minCol <= maxCol) {

            // Left to Right
            for (int j = minCol; j <= maxCol; j++) {
                System.out.print(arr[minRow][j] + " ");
            }
            minRow++;

            if (minRow > maxRow || minCol > maxCol) break;

            // Top to Bottom
            for (int i = minRow; i <= maxRow; i++) {
                System.out.print(arr[i][maxCol] + " ");
            }
            maxCol--;

            if (minRow > maxRow || minCol > maxCol) break;

            // Right to Left
            for (int j = maxCol; j >= minCol; j--) {
                System.out.print(arr[maxRow][j] + " ");
            }
            maxRow--;

            if (minRow > maxRow || minCol > maxCol) break;

            // Bottom to Top
            for (int i = maxRow; i >= minRow; i--) {
                System.out.print(arr[i][minCol] + " ");
            }
            minCol++;
        }



        }
    }

