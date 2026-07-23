package DSASeries.TwoDimensionalArray;

public class minimumInArray {
    static void main(String[] args) {
        int[][] arr = {{1,2,34},{-4,5,6},{7,8,-9}};
        int mx = Integer.MAX_VALUE;
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx = Math.min(mx,arr[i][j]);
            }
        }
        System.out.println(mx);
    }
    }

