package basic;

import java.util.Scanner;

public class halfOfGivenInteger {
    static void main(String[] args) {
        // type casting for int to double --

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int a  = sc.nextInt() ;
        double y = (double) a ;
        System.out.println(y/2);

        // type casting double to int --

        System.out.print("Enter c num : ");
        double c = sc.nextDouble() ;
        int z = (int) c ;
        System.out.println(z);
     }
}
