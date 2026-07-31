package DSASeries.String;

public class stringBuilderInsertAndDeleteMethod {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdefgh");
        System.out.println(sb);

        // delete
        sb.deleteCharAt(3);
        System.out.println(sb);

        System.out.println(sb.charAt(3));
        //append
        sb.append("xyz");
        System.out.println(sb);

        // delete
        // 1
         sb.deleteCharAt(2) ;
        System.out.println(sb);

        // 2
        sb.delete(2,5);
        System.out.println(sb);

        //insert

        sb.setCharAt(4,'e');
        System.out.println(sb);

        sb.insert(2,"sr");
        System.out.println(sb);

    }
}
