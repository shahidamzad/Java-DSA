package practiceQuestions;

import java.util.Scanner;

public class SumOfGivenNum {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = input.nextInt();

    int sum = 0;

        while (n > 0) {
            int digit = n % 10; // Last digit
            sum = sum + digit;    // Add digit to sum
            n = n / 10;       // Remove last digit
        }

        System.out.println("Sum of digits = " + sum);
    }

}
