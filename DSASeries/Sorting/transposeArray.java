package DSASeries.Sorting;

public class transposeArray {
    public  static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]  arr = {10,2,32,41,85};
        int n = arr.length;
        print(arr);
        int x = 0 ;

        for (int i = 0; i < n ; i++) {
            int min = Integer.MAX_VALUE;
            int midIndex = -1 ;
            for (int j = 0; j < n; j++) {
                if(arr[j] < min && arr[j]>0) {
                    min = arr[j];
                    midIndex = j;
                }
            }
            arr[midIndex] = x;
            x--;
        }
        print(arr);
        for (int i = 0; i < n ; i++) {
            arr[i] *= -1;
        }
        print(arr);
    }
}
