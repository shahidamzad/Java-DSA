package Conditionals;

import java.util.Scanner;

public class absoluteValue {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();

        if(num<0){
            System.out.println(-num);
        } else{
            System.out.println(num);
        }
    }
}
