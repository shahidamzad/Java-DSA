package DSASeries.Array;

public class basicSyntax {
    public static void main(String[] args) {
        int[] arr ; // declaration
        arr = new int[5]; // memory allocation

        // initialization
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        // output off arr element
        System.out.print(arr[0]);
        // update
        arr[0] = 5;
        System.out.println(arr[0]);
    }
}
