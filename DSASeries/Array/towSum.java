package DSASeries.Array;

public class towSum {
    static void main(String[] args) {
        int x = 9;
        int[] arr = {2, 5, 7, 3, 11};

        int n = arr.length;

        // Solution
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
               if (arr[i] + arr[j] == x) {
                   System.out.println(arr[i] + " "+ arr[j]);
               }

            }

        }
        System.out.println();
    }
}
