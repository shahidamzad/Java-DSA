package DSASeries.Array;

import java.util.Scanner;

public class linearSearch {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // x input
        System.out.print("Enter the Target element : ");
        int x  = input.nextInt();
        // arr size
        System.out.print("Enter the Size of the Array : ");
        int  n = input.nextInt();

        int[] arr = new int[n];

        // arr value
        System.out.print("Enter the  element of Array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // solution
        boolean flag = false;
        for (int i = 0; i <n ; i++) {
            if (arr[i] == x){
                flag = true;
                break;
            }
        }
        if (flag == true){
            System.out.print("Element  found");
        }
        else {
            System.out.print("Element not found");
        }


    }
}
