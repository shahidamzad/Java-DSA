package DSASeries.Array;

public class passArrayToMethod {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        System.out.print(arr[0]);
        System.out.println();

        change(arr);

        System.out.println(arr[0]);
    }

    public static void change(int[] arr) {
         arr[0] = 50 ;
    }
}
