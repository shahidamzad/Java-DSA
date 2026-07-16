package patternPrinting.triangle;

import java.util.Scanner;
public class starTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :  ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){ // rows
            for (int j = 1; j <= i ; j++){ // cols
                System.out.print( "*" +" ");
            }
            System.out.println();
        }
    }
}
