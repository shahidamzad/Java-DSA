package DSASeries.Array;

import java.util.Scanner;

public class inputOutput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        // input from loop
        for(int i =0 ; i <=5;i++){
            arr[i] = sc.nextInt();

        }
        // output from loop
        for (int i = 0; i<=5;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
