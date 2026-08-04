package DSASeries.Sorting;

public class selectionSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[] arr = {10, -4,20,1,8,6} ;
        print(arr);
        int n = arr.length;

        // selection sorting 9
        for (int i = 0; i < n -1 ; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < n ; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            // swap arr[i] to arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        print(arr);
    }
}
