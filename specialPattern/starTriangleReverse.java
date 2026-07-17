package specialPattern;

import java.util.Scanner;

public class starTriangleReverse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :  ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){ // rows
            for (int j = 1; j <= n + 1 - i  ; j++){ // cols
                // use for Star
//                System.out.print( " * " +" ");

                // use  for number
                System.out.print(  j +" ");

                // use for alphabets
                // add in j  64 for capital and 96 for small
//                System.out.print( (char) (j + 64) +" ");
//                System.out.print( (char) (j + 96) +" ");
            }
            System.out.println();
        }
    }
}
