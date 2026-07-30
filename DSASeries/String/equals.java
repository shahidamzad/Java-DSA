package DSASeries.String;

public class equals {
    static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz" ;
        String b = new String(s);
        String c = "abc";
        c = c + "xyz" ;

        System.out.println(s==c);
        System.out.println(s.equals(c));
    }
}
