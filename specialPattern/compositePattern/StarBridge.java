package specialPattern.compositePattern;

import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print("*"+" ");

        }
        System.out.println();
        n--;
        for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("*"+ " ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(" "+ " ");
            }
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }


    }
}
