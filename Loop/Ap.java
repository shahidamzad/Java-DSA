package Loop;

import java.util.Scanner;

public class Ap {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
//using Math formulla
        // 1,3,5,7,9,11,13
//        for(int i =1 ;   i <=2*n -1; i +=2){
//            System.out.println(i);
//        }

        // 4,7,10,13,16,19,22,25,

        for(int i=4; i<=3*n+1;i+=3){
            System.out.println(i);
        }
    }
}
