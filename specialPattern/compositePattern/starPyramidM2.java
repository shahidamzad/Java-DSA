package specialPattern.compositePattern;

import java.util.Scanner;

public class starPyramidM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  n : ");
        int n = sc.nextInt();

        int nsp =n-1;
        int nps = 1 ;

        for (int i = 1; i <= n; i++) { // row
            for (int j = 1; j <= nsp; j++) {// spaces
                System.out.print(" "+ " ");
            }
            for (int j = 1; j <=nps ; j++) { // star square
                System.out.print(j + " ");

            }
            System.out.println();
            nsp--;
            nps+= 2 ;
        }
    }
}
