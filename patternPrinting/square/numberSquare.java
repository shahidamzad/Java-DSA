package patternPrinting.square;

import java.util.Scanner;
public class numberSquare {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :  ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){ // rows
            for (int j = 1; j <= n ; j++){ // cols
                System.out.print( j +" ");
            }
            System.out.println();
        }
    }
}
