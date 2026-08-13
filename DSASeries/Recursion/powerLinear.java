package DSASeries.Recursion;

import java.util.Scanner;
public class powerLinear {
    static int pow(int a, int b){ // time complexity = O(b)
        if (b == 0) return 1; // base case
        return a * pow(a,b - 1); // call & work
    }

    static int pow2(int a, int b){ // TC = O(log b)
        if (b == 0) return 1; // base case
        int ans = pow2(a,b/2);
        if(b%2==0) return  ans * ans ;
        else  return  ans * ans * a;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int a = sc.nextInt();
        System.out.print("Enter b number : ");
        int b = sc.nextInt();

        System.out.println(pow2(a,b));
    }
}
