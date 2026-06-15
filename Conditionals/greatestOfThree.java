package Conditionals;

import java.util.Scanner;

public class greatestOfThree {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a 1st  number : ");
        int a = sc.nextInt();
        System.out.print("enter a  2nd number : ");
        int b = sc.nextInt();
        System.out.print("enter a 3rd number : ");
        int c = sc.nextInt();


        if(a >= b && a >= c) System.out.println( a + "The greatest number is ");
        else if(b >= a && b >= c) System.out.println( b + "The greatest number is ");
        else  System.out.println( c  +  "The greatest number is ");


    }
}
