package DSASeries.Array;

public class reverseArray {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        // reverse
      // method 1
//        for (int i = 0; i < n / 2 ; i++) {
//            int j =  n - i - 1;
//            int temp = arr[j];
//            arr[j] = arr[i];
//            arr[i] = temp;
//
//        }
        // method 2
        // int i = 1 , j=5; // part of array reverse
        int i = 0 , j = n-1;

        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
}
