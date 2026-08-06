package DSASeries.BinarySearching;

public class lowerBound {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 46,46,60, 70, 80, 90};
        int target = 46;
        int n = arr.length;

        int lb = n ;

        int low = 0 ;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low)/2;
            if (arr[mid] >= target) {
                lb = Math.min(lb,mid);
                high = mid - 1;
            }
            else low = low + 1;
        }
        System.out.println(lb);
    }
}
