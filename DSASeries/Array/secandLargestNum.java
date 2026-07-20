package DSASeries.Array;

public class secandLargestNum {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};

        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max = Math.max(arr[i],max);
            }

            int smax = Integer.MIN_VALUE;
            for(int i = 0;i<n;i++){
                if(arr[i] != max){
                    smax = Math.max(arr[i],smax);
                }
            }
            System.out.println(smax);
            System.out.println(max);
        }



}
