package Conditionals;

import java.util.Scanner;

public class greatestOfThreeNestedifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a 1st number : ");
        int a = sc.nextInt();
        System.out.print("enter a 2nd number : ");
        int b = sc.nextInt();
        System.out.print("enter a 3rd number : ");
        int c = sc.nextInt();


        if (a> b){
            if (a>c) System.out.println( a+ " :a" + "The greatest number");

            else System.out.println( c  + " : c"  + "The greatest number ");
        }else {
            if (b > c) System.out.println(b+"b" + "The greatest number ");
            else System.out.println(c+" :c" + "The greatest number");
        }
    }
}
