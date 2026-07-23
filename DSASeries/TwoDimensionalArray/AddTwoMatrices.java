package DSASeries.TwoDimensionalArray;

public class AddTwoMatrices {
    static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6},{7,8,9}};
        int[][] b= {{10,11,12},{13,14,15},{16,17,18}};

        // initialze arr length / index
        int m = a.length;
        int n =a[0].length;

        int[][] res = new int[m][n];

        // solutions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }

        // output
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();

        }
    }
}
