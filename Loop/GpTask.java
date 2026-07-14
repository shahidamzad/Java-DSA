package Loop;

import java.util.Scanner;

public class GpTask {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        // 3,12,48 ..

        int a = 3 ;
        int b = 4;

        int c = a ;

        for (int i = 1; i <= n ; i++) {
            System.out.println(c + " ");
            c = c * b;

        }

    }
}
