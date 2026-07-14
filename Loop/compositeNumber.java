package Loop;

import java.util.Scanner;

public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        int x = 0;
        for(int i = 2; i<n ; i++){
            if(n%i==0){
                System.out.println("composite number");
                x = 1 ;
                break;
            }
            }
        if(n==1) System.out.println("neither prime or composite number");
        else if(x==0) System.out.println("prime number");
    }
}
