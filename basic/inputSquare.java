package basic;

import java.util.Scanner;

public class inputSquare {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :  ");
        int n = sc.nextInt();
        System.out.println( "Square of Number : " + (n*n));
    }
}
