package specialPattern.compositePattern;

import java.util.Scanner;

public class daimondPattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int nps = n-1 ;
        int nst = 1 ;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nps; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            nps -- ;
            nst += 2 ;
        }
         nps = 1;
         nst = nst - 4 ;

        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= nps; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            nps ++ ;
            nst -= 2 ;
        }
    }
}
