package DSASeries.Advance_sorting;

public class margeTwoSortedArray {
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void marge(int[] a, int[] b , int[] c) {
        int i = 0 , j = 0 , k = 0 ;
        while (i < a.length && j < b.length){
            if (a[i] <= b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length){
            c[k] = a[i];
            k++;
            i++;
        }
        while (j < b.length){
            c[k] = b[j];
            j++;
            k++;
        }
    }

    static void main(String[] args) {
        int[] a = {10,20,30,40,50,60,70};
        int[] b = {9,25,39,45,55,62};
        print(a);
        print(b);

        int[] c = new int[a.length+b.length];

        marge(a,b,c);

        print(c);
    }
}
