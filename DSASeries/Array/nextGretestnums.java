package DSASeries.Array;

public class nextGretestnums {
    static void main(String[] args) {
        int[] arr = {12,8,60,37,2,49,16,25,21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1 ;
        int nextGreatestNumber = arr[n-1];

        for (int i = n-2; i >= 0; i--) {
            ans[i] = nextGreatestNumber ;
            nextGreatestNumber = Math.max(nextGreatestNumber , arr[i]);

        }

        for (int ele : ans){
            System.out.print(ele + " ");
        }


    }
}
