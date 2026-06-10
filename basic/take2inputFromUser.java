package basic;

import java.util.Scanner;

public class take2inputFromUser {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Num : ");
        int a = sc.nextInt();
        System.out.print("Enter Secand Num : ");
        int b = sc.nextInt();

        System.out.println( "Sub of A & B : " + (a+b) );
    }
}
