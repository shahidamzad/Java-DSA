package practiceQuestions;

import java.util.Scanner;

public class warToCountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int count = 0;
        while(n!= 0){
            n /=10;
            count++;
        }
        System.out.print(count);
    }
}
