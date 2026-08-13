package DSASeries.Recursion;

import java.util.Scanner;
public class sumReturnType {
    static int sum(int n){
        if (n == 1 || n == 0) return 1; // bace case
        return n + sum(n - 1); // call & work
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
