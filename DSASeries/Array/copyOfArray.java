package DSASeries.Array;

import java.util.Arrays;
public class copyOfArray {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};

        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int[] nums = arr ; // shallow copy
//        nums[0] = 12;
//        System.out.print(arr[0] + " ");
//        for(int ele : arr1){
//            System.out.print(ele + " ");
//        }

        // Deep copy
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 15;
        for(int ele : brr){
            System.out.print(ele + " ");
        }

    }
}
