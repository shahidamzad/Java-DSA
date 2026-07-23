package DSASeries.TwoDimensionalArray;

public class maxInArray {
    static void main(String[] args) {
        int[][] arr = {{1,2,34},{-4,5,6},{7,8,-9}};
        int mx = Integer.MIN_VALUE;
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx = Math.max(mx,arr[i][j]);
            }
        }
        System.out.println(mx);
    }

    public static class transformIntoTranspose {
        public static void print(int[][] arr ) {
            int m = arr.length;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + " ");

                }
                System.out.println();
            }
        }
        static void main(String[] args) {
            int[][] arr = {{1,2,3}, {4,5,6},{7,8,9}};
            int m = arr.length;
            print(arr);

            // transposing
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < i; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp ;
                }

            }
            System.out.println();
            print(arr);

        }
    }
}
