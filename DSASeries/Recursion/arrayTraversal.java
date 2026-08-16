package DSASeries.Recursion;

public class arrayTraversal {
    public static void print(int i , int[] arr){
        if(i==arr.length) return;
        System.out.print(arr[i] + " ");
        print(i+1, arr);
    }

    static void main(String[] args) {
        int[] arr = {1,4,7,9,6,3};
        print(0,arr);
    }
}
