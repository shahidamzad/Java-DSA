package DSASeries.Recursion;

public class stringTraversal {
    public static void skip(int i , String s, String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        if (s.charAt(i) != 'a') ans += s.charAt(i);
        skip(i+1, s, ans);
    }

    static void main(String[] args) {
        String s  = "raghav garg";
        skip(0,s," ");
    }
}
