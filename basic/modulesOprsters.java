package basic;

import java.util.Scanner;

public class modulesOprsters {
    static void main(String[] args) {
        // -a % b = ans has - value
        // a % -b = ans has + value
        // -a % -b = ans has - value
        // a < b = a%b  = a ans

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Value Of  A :  ");
        int a = sc.nextInt();
        System.out.print("Enter Value Of  B:  ");
        int b = sc.nextInt();

        System.out.println("Modules of A & B : " + (a % b));
    }
}