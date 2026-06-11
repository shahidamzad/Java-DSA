package basic;

import java.util.Scanner;

public class charDataType {
    static void main(String[] args) {

        //  Alphabets

        // a b c ....z
        // A B C .... Z

        // special characters

        // ! @ # $ % ^ &

        //1  2 3 4 ... 9

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a Character : ");
        char ch = sc.next().charAt(0);
        System.out.println(ch);
    }
}
