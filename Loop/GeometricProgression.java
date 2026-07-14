package Loop;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        int a= 1, b=2;

        for(int i=1;i<=n;i++){
            a = a * b ;
            System.out.println(a);
        }
    }
}
