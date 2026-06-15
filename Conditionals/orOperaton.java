package Conditionals;

import java.util.Scanner;

public class orOperaton{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();

        if (num % 5 == 0 || num % 3 == 0)
            System.out.print("Divisible by 5 and 3  ");
        else
            System.out.print("Not Divisible by 5 and 3 ");

    }
}
