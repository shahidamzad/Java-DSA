package DSASeries.Recursion;

public class preInPost {
    public static void pip(int n){
        if(n==0) return;
        System.out.println(n); //pre
        pip(n-1);
        System.out.println(n);// in
        pip(n-1);
        System.out.println(n); // post

    }
    static void main(String[] args) {
        pip(3);
    }
}
