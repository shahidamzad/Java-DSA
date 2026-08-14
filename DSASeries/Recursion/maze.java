package DSASeries.Recursion;

import java.util.Scanner;
public class maze {
    public static int maze(int row, int col , int n,int m) {
        if(row == m || col == n) return 1;
        int rightway = maze(row , col +1 , m,n);
        int leftway = maze(row +1 , col , m,n);
        return leftway + rightway;
    }

    public static int maze2( int m,int n){
        if(m == 1|| n== 1) return 1;
        int rightway = maze2( m,n-1);
        int leftway = maze2(m-1,n);
        return leftway + rightway;
    }
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();
        System.out.print("enter m: ");
        int m = sc.nextInt();
//        System.out.println(maze(1,1,m,n));
        System.out.println(maze2(n,m));
    }
}
