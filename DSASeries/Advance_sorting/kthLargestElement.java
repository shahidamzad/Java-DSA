package DSASeries.Advance_sorting;

public class kthLargestElement {
    static int ans ;
    public static void print(int[] arr) {
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static int partition(int[] arr, int low, int high) {
        int mid = (low + high)/2;
        int pivot = arr[mid];
        int pivotIndex = mid;

        // Count elements smaller than or equal to pivot
        int smallestCount = 0;

        for (int i = low ; i <= high; i++) {
            if(i == mid) continue;
            if (arr[i] <= pivot) {
                smallestCount++;
            }
        }

        // Find correct position of pivot
        int correctIndex = low + smallestCount;

        // Put pivot at correct position
        swap(arr, pivotIndex, correctIndex);

        // Partition
        int i = low;
        int j = high;

        while (i < correctIndex && j > correctIndex) {
            if (arr[i] <= pivot) {
                i++;
            }
            else if (arr[j] > pivot) {
                j--;
            }
            else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return correctIndex;
    }

    public static void quickSelect(int[] arr, int low, int high , int k) {

        // Base condition
        if (low > high) {
            return;
        }
        if (low == high) {
            if(low == k-1) ans = arr[low];
            return;
        }

        int idx = partition(arr, low, high);

        if (idx == k -1) {
            ans = arr[idx];
            return;
        }

        quickSelect(arr, low, idx - 1,k);
        quickSelect(arr, idx + 1, high,k);
    }

    public static void main(String[] args) {

        int[] arr = {4, 9, 1, 2,6, 5, 8};

        print(arr);

        int k = 4;
        ans= -1;

        quickSelect(arr, 0, arr.length - 1 , k);

        print(arr);
        System.out.println(ans);;
    }
}
