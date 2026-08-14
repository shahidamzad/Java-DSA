package DSASeries.Recursion;

import java.util.Scanner;

public class stair {
    public static int stair(int n) {
        // base cases
        if (n == 0) return 1;   // one valid way
        if (n < 0) return 0;    // invalid path

        return stair(n - 1) + stair(n - 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println( stair(n));

        sc.close();
    }
}
