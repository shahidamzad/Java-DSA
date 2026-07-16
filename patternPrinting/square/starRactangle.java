package patternPrinting.square;

import java.util.Scanner;

public class starRactangle {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter Rows & Columns: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i <= m; i++) { // row
            for (int j = 1 ; j <= n ; j++){ // columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
