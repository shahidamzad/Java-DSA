package DSASeries.TwoDimensionalArray;

public class rowWiseColWisePrinting {
    static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6},{7,8,9}};
        int m = a.length, n = a[0].length ;

        // RowWise printing
        for (int i = 0; i < m; i++) { // rows
            for (int j = 0; j < n; j++) { // cols
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // cols wise printing
        for (int j = 0; j < n; j++) { // cols
            for (int i = 0; i < m; i++) { // rows
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
