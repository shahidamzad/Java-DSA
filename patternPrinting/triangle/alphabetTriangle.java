package patternPrinting.triangle;

import java.util.Scanner;

public class alphabetTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :  ");
        int n = sc.nextInt();
        // add 64 in j for capital alphabets
        // add 96 in j for small alphabets

        for (int i = 1; i <= n; i++){ // rows
            for (int j = 1; j <= i ; j++){ // cols
//                System.out.print( (char) (j + 64) + " ");

                System.out.print((char) (j + 96)+" ");

            }
            System.out.println();

        }
    }
}
