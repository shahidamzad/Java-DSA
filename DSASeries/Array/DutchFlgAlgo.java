package DSASeries.Array;

public class DutchFlgAlgo {
    static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;

        int noOfZero = 0 ;
        int noOfOne = 0 ;

        for (int i = 0; i < n; i++) {
            if (arr[i]== 0) noOfZero++ ;
            if (arr[i]== 1) noOfOne++ ;
        }

        for (int i = 0; i < n ; i++) {
            if (i<noOfZero) {
                arr[i]= 0 ;
            } else if (i<noOfZero + noOfOne) {
                arr[i] = 1 ;
            }else  arr[i] = 2 ;

        }

        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }
}
