package DSASeries.Recursion;

import java.util.Scanner;

public class GcdRef {
    // HCF
    public static int HCF(int a, int b) {
        for (int i = Math.min(a,b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int GCD(int a, int b) {
        if (b%a == 0) return a;
        return GCD(b%a,a);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter a number: ");
        int a = sc.nextInt();
        System.out.print( "Enter b number: ");
        int b = sc.nextInt();

//        System.out.println(HCF(a,b));
        System.out.println(GCD(a,b));


    }
}
