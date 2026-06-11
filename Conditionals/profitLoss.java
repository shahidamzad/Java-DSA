package Conditionals;

import java.util.Scanner;

public class profitLoss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a cost price : ");
        int cp = sc.nextInt();
        System.out.print("enter a selling price : ");
        int sp = sc.nextInt();

        if (cp < sp){
            System.out.print("profit is : ");
            System.out.print(sp-cp);
        } else if (cp == sp) {
            System.out.println("no  profit , no loss");
        }
        else {
            System.out.print("loss is  : ");
            System.out.print(cp-sp);
        }


    }
}
