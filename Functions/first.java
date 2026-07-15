package Functions;
import java.util.Scanner;
public class first {
    static int cal(int n  ){
        return  n * n;

    }
    static int subs(int n){
        return  cal(n) - 4;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int result = cal(n);
        System.out.println(result);

        int sub = subs(n);
        System.out.println(sub);


    }
}



