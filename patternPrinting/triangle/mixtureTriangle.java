package patternPrinting.triangle;

import java.util.Scanner;

public class mixtureTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :  ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){ // rows
             if (i % 2 == 0){
                 for (int j = 1; j <= i ; j++){
                     System.out.print( (char) (j + 64) +" ");
                 }
             }
            else {
              for (int j = 1; j <= i ; j++){ //cols
                  System.out.print(j +" ");
              }

            }
            System.out.println();
        }
    }
}
