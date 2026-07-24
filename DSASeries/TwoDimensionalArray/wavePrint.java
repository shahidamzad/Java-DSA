package DSASeries.TwoDimensionalArray;

public class wavePrint {
    public static void print(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6},{7,8,9}};
        int rows = arr.length;
        int cols = arr[0].length;
        print(arr);

        // wave printing --> row wise (Alternate)

        for (int i = 0; i < rows; i++) {
            if(i%2==0){
                for (int j = 0; j <rows ; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }else {
                for (int j = cols-1; j >=0 ; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }

        }
    }
}
