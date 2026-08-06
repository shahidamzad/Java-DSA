package DSASeries.BinarySearching;

public class basicOfBinarySearch {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 50;

        print(arr);

        int n = arr.length;
        int left = 0;
        int right = n - 1;
        boolean flag = false;

        while (left <= right) {
            int mid =  (right + left) / 2;
            if(arr[mid] <target){
                left = mid + 1;
            }
            else if(arr[mid] > target){
                right = mid - 1;
            }
            else if(arr[mid] == target) {
                flag = true;
                break;
            }

        }
        if (flag == true) System.out.println( " TARGET FOUND ");
        else System.out.println( " NOT FOUND ");
    }
}
