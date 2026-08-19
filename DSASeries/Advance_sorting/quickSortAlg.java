package DSASeries.Advance_sorting;

public class quickSortAlg {

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

    public static void quickSort(int[] arr, int low, int high) {

        // Base condition
        if (low >= high) {
            return;
        }

        int idx = partition(arr, low, high);

        quickSort(arr, low, idx - 1);
        quickSort(arr, idx + 1, high);
    }

    public static void main(String[] args) {

        int[] arr = {4, 9, 7, 1, 2, 3, 6, 5, 8};

        print(arr);

        quickSort(arr, 0, arr.length - 1);

        print(arr);
    }
}