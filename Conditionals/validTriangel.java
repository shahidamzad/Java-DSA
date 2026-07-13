package Conditionals;

import java.util.Scanner;

public class validTriangel {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st side : ");
        int a = sc.nextInt();
        System.out.print("enter 2nd side : ");
        int b = sc.nextInt();
        System.out.print("enter 3rd side : ");
        int c = sc.nextInt();

        if( (a+b) > c && (a+c) > b && (b+c) > a ){
            System.out.println("The number is valid");
        }else {
            System.out.println("The number is not valid");
        }
    }
}
