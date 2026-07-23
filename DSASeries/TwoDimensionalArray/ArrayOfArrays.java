package DSASeries.TwoDimensionalArray;

public class ArrayOfArrays {
    static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        // for each uses

        for(int[] ele : arr){
            for (int x: ele){
                System.out.print(x +" ");
            }
            System.out.println();
        }




    }
}
