package Loop;

import java.util.Scanner;

public class continues {
    public static void main(String[] args) {

        // 100

//        for (int i = 0; i <=100 ; i++) {
//            if(i%2==0){
//                System.out.println(i);
//            }
//
//        }

        // 50
//        for (int i = 0; i <=100 ; i+=2) {
//                System.out.println(i);
//        }

        // continues method

        for (int i = 1; i <=100 ; i++) {
            if(i%2!=0){
                continue;
            }
                System.out.print(i + " ");
            }




    }
}
