package DSASeries.Advance_sorting;

public class marge_sort {
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void marge(int[] a, int[] b , int[] c) {
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        while (i < a.length && j < b.length){
            if (a[i] <= b[j]){
                c[k++] = a[i++];

            }
            else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length){
            c[k++] = a[i++];

        }
        while (j < b.length){
            c[k++] = b[j++];

        }
    }

    public static void margeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        // creation 2 new array
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        // copy past
        for(int i = 0; i < n/2; i++){
            a[i] = arr[i];

        }
        for(int i = 0; i < n-n/2; i++){
            b[i] = arr[i+n/2];
        }

        // magic
        margeSort(a);
        margeSort(b);

        // marge this "a" and "b"
        marge(a,b,arr);

    }
    static void main(String[] args) {
        int[] arr = {103,56,89,5,75,62,30};

        print(arr);
        margeSort(arr);
        print(arr);
    }
}
