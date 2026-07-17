package specialPattern;

import java.util.Scanner;
public class oddNumTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :  ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){ // rows

            // 2 method  = j <= 2 * i - 1
            for (int j = 1; j <= 2 * i-1 ; j++){ // cols
                // 1 method = sout = (2 * j - 1)
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
