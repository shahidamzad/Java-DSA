package Loop;

import java.util.Scanner;

public class takeInputofForr {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("hello world");
        }
    }
}
