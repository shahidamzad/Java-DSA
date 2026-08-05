package DSASeries.Sorting;

public class insertionSort {
    public static void  print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
    static void main(String[] args) {

        int[] arr = {10,-4,2,1,8,6} ;
        print(arr);
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            for (int j = i; j >=1; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr,j-1 ,j);
                }
                else break;

            }

        }
        print(arr);

    }
}
