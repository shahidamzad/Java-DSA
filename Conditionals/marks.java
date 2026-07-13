package Conditionals;

import java.util.Scanner;

public class marks {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the marks  : ");
        int n = sc.nextInt();

        if(n>=81){
            System.out.println("very good");
        } else if (n>=61) {
            System.out.println("good");
        } else if (n>=40) {
            System.out.println("Average");
        }else{
            System.out.println("Fail");
        }


    }
}
