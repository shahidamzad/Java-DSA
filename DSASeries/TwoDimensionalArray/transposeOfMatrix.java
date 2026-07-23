package DSASeries.TwoDimensionalArray;

public class transposeOfMatrix {
    static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6},{7,8,9}};

        int rows = arr.length, cols = arr[0].length;

        int[][] result = new int[cols][rows] ;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr[j][i];
                System.out.print(result[i][j] +" ");

            }
            System.out.println();

        }
    }
}
