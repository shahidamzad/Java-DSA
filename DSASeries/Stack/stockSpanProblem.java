package DSASeries.Stack;


import java.util.Arrays;

public class stockSpanProblem {
  static void calculateSpan(int[] price, int[]ans,int n){
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i]=1;
            for (int j = i-1; j >= 0 && price[i]>=price[j]; j--) {
                ans[i]++;
            }
        }
    }

    static void printArray(int[] arr){

        System.out.println(Arrays.toString(arr));
    }

    static void main(String[] args) {
        int[] price= {10,4,5,90,120,80};
        int n = price.length;

        int[] ans = new int[n];

        calculateSpan(price,ans,n);

        printArray(ans);
    }
}
