package DSASeries.TwoDimensionalArray;

public class multiplicationOfTwoMatrix {

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
        int[][] a = {{1,2,3}, {4,5,7}};
        int[][] b = {{1,0,2,3}, {4,5,7,5},{2,6,7,6}};

        if (a[0].length != b.length) {
            System.out.print("multiplication not possible");
        }else {
            int[][] c = new int[a.length][b[0].length];
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        c[i][j] += a[i][k] *  b[k][j] ;
                    }
                }
            }
            print(a);
            print(b);
            print(c);
        }


    }
}
