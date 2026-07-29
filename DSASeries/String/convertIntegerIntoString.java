package DSASeries.String;

import java.util.Scanner;

public class convertIntegerIntoString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr Integer : ");
        int n = sc.nextInt();

        String s = "" + n;
        System.out.print(s);

    }
}
