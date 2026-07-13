package Loop;

import java.util.Scanner;

public class TakeInputNprintTables {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Numbers : ");
        int n = sc.nextInt();


        for(int  i=1; i <= 10; i++){
            System.out.println((n * i));
        }
        sc.close();
    }
}
