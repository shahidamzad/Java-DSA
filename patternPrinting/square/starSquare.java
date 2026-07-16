package patternPrinting.square;

import java.util.Scanner;

public class starSquare {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :  ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n ; j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
