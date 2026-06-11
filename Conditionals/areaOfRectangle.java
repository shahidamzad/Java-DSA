package Conditionals;

import java.util.Scanner;

public class areaOfRectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter the breath of the rectangle: ");
        double b = sc.nextDouble();

        System.out.print("Enter A for area and P for perimeter : ");
        char ch = sc.next().charAt(0);

        double area = l*b;
        double perimeter = 2*(l+b);

        if (ch == 'A' || ch == 'a' ) {

            System.out.println("The area of the rectangle is " + area);
        }
        if (ch == 'P' || ch == 'p' ) {

            System.out.println("The area of the rectangle is " + perimeter);
        }
        if ( perimeter > area ) {
            System.out.println("The perimeter  is greater than area ");
        }
        if ( perimeter < area ) {
            System.out.println("The perimeter  is less than area ");
        }



    }
}
