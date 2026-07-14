package Loop;

import java.util.Scanner;

public class ApWithoutMathFormula {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int a = 1;
        // 1,3,5,7,9,.....

        for(int i=1;i<=n;i++){
            a+=2;
            System.out.println(a);
        }
    }
}
