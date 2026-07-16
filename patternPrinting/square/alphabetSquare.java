package patternPrinting.square;
import java.util.Scanner;
public class alphabetSquare {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n :  ");
        int n = sc.nextInt();
        // add 64 for capital alphabets
        // add 96 for small alphabets

        for (int i = 1; i <= n; i++){ // rows
            for (int j = 1; j <= n ; j++){// cols

                // use  i = to print rows
                // use j = to print cols
                System.out.print( (char) ( j + 96) + " ");
            }
            System.out.println();
        }
    }

}
