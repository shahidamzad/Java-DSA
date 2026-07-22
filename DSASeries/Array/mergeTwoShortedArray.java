package DSASeries.Array;

public class mergeTwoShortedArray {
    static void main(String[] args) {

        int[] a = {1, 3, 4, 7};
        int[] b = {2, 5, 6, 8, 9, 70};

        int[] c = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of array a
        if (i==a.length) {
            while (j < b.length) {
                c[k] = b[j];
                j++;
                k++;
            }
        }

        // Copy remaining elements of array b
        if (j == b.length) {
            while (i < a.length) {
                c[k] = a[i];
                i++;
                k++;
            }
        }

        // Print merged array
        for (int ele : c) {
            System.out.print(ele + " ");
        }

    }
}




