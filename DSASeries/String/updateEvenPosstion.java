package DSASeries.String;

import java.util.Scanner;

public class updateEvenPosstion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");

        String s = sc.nextLine();
        String even = "" ;

        for (int i = 0; i <= s.length(); i++) {

            if (i%2==0) even += "a";
            else  even += s.charAt(i);

        }
        s = even;
        System.out.print(s);
    }
}
