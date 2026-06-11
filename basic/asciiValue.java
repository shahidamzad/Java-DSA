package basic;

import java.util.Scanner;

public class asciiValue {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Character : ");
        char ch = sc.next().charAt(0);


        // use to convert character into ASCII value
        int x = (int)ch;
        System.out.println(x);
    }
}
