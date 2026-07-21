package DSASeries.Array;

public class SortArrayZeroOnes {
    static void main(String[] args) {
        int[] arr = {0,1,0,1,0,0,1,1,1,0,1,0,0,0,1,1};

        int n = arr.length;
        // solution 1
//        int numOfZero = 0 ;
//        for (int i = 0 ; i < n; i++) {
//            if (arr[i] == 0) numOfZero++;
//
//        }
//
//            for (int i = 0 ; i<n; i++){
//                if(i<numOfZero)arr[i]= 0;
//                else arr[i]=1;
//
//            }
//            for( int ele : arr){
//                System.out.print(ele + " ");
//            }
//        System.out.println();

        // solution 2

        int i = 0 , j = n-1 ;

        while(i<j) {
            if (arr[i] == 0) i++;
           if (arr[j] == 1) j--;
//            if(i>j) break;
           if  ( i<j && arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }

        }
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}


