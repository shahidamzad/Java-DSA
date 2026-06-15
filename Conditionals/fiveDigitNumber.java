package Conditionals;
import java.util.Scanner;
public class fiveDigitNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();

        if (num>9999 && num<100000){
            System.out.print("5 Digit number  ");
        }else {
            System.out.print("Not 5  Digit number ");
        }
    }
}
