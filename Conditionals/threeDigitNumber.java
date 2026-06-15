package Conditionals;

import java.util.Scanner;

public class threeDigitNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();


        if (n>99 && n<1000) {
            System.out.print("3 Digit number : ");
        }
        else {
            System.out.print("Not  3 Digit number : ");
        }


    }
}
