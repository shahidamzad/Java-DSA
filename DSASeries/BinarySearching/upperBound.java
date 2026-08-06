package DSASeries.BinarySearching;

public class upperBound {
    static void main(String[] args) {
        int[] arr = {10,23,46,46,91,97,97,170,180};
        int target = 46;
        int n = arr.length;
        int ub = n ;

        int low = 0 ;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low)/2;
            if (arr[mid] > target) {
                ub = Math.min(ub,mid);
                high = mid - 1;
            }
            else low = low + 1;
        }
        System.out.println(ub);
    }
}
