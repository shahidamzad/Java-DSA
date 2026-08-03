package DSASeries.Sorting;

public class checkArrayIsSortedOrNot {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int n = arr.length;

        boolean flag = true;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }
        if (flag == true ) System.out.println("Sorted array");
        else System.out.println("Not sorted array");

    }
}
