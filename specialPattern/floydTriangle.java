package specialPattern;

import java.util.Scanner;

public class floydTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :  ");
        int n = sc.nextInt();
        int a = 1 ;
        for (int i = 1; i <= n; i++){ // rows

            for (int j = 1; j <= i ; j++){ // cols
                System.out.print( a +" ");
                a++ ;
            }
            System.out.println();
        }
    }
}
