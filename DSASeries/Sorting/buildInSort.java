package DSASeries.Sorting;

import java.util.Arrays;

public class buildInSort {
    static void main(String[] args) {
        // BuildIn Sort method

        int[] arr = {7,1,4,5,9,11,15,10};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // buildIn Sort method
        Arrays.sort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
