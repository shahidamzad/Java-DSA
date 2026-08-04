package DSASeries.Sorting;

public class bubbleSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[] arr = {1,4,2,-5,77,};
        int n =  arr.length;

        print(arr);
        //Bubble sort 1
//        for (int j = 0; j <=n-1 ; j++) {
//            for (int i = 0; i < n - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }

//        Bubble sort 2
//        for (int j = 0; j <n-1 ; j++) {
//            for (int i = 0; i < n - 1 - j ; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
        // optimize Bubble sort
        for (int j = 0; j <n-1 ; j++) {
            boolean flag = true;
            for (int i = 0; i < n - 1 - j ; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }

            if (flag == true) break;
        }
        
        // check 
        

        print(arr);





    }

}
