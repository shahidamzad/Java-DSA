package DSASeries.TwoDimensionalArray;

public class sumOfElement {
    static void main(String[] args) {
        int[][] arr = {{1,2,34},{-4,5,6},{7,8,-9}};
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0 ;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);

    }
}
