package DSASeries.String;

import java.util.Scanner;

public class countVowels {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");

        String str = sc.nextLine();
        int n = str.length();

        int count = 0 ;

        for (int i = 0; i <n; i++) {
            char ch = str.charAt(i);
            if (isVawels(ch) == true ){
                count++;
            }

        }
        System.out.println(count);

    }
    public static boolean isVawels(char ch ){
        if (ch =='a' || ch =='A') return true ;
        if (ch =='e' || ch == 'E') return true ;
        if (ch =='i' || ch == 'I') return true ;
        if (ch =='o' || ch == 'O') return true ;
        if (ch =='u' || ch == 'U') return true ;
        return  false;

    }
}
