package Conditionals;

import java.util.Scanner;

public class calculaterSwitchMethod {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a = sc.nextInt();
        System.out.print("enter a opration : ");
        char op = sc.next().charAt(0);
        System.out.print("enter a number : ");
        int b = sc.nextInt();

        // if logic
       /*
       if(op == '+') System.out.println(a+b);
        if (op == '-') System.out.println(a-b);
        if (op == '*') System.out.println(a*b);
        if (op == '/') System.out.println(a/b);
        if (op == '^') System.out.println(Math.pow(a, b));

        */

        // switch case

        switch (op){
            case '+':
                System.out.println(a+b);
                break;
            case  '-':
                System.out.println(a-b);
                break;
            case  '*':
                    System.out.println(a*b);
                    break;
            case  '/':
                    System.out.println(a/b);
                        break;
            case  '^':
                    System.out.println(Math.pow(a, b));
        }


    }
}
