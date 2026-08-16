package DSASeries.Recursion;

import java.util.ArrayList;

public class subSet {
    static ArrayList<String > arr = new ArrayList<>();
    public static void printSubSet(int i , String s , String ans){
        if (i ==s.length()){
           arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubSet(i+1,s,ans+ch); // take character
        printSubSet(i+1,s,ans); // not takes character
    }
    static void main(String[] args) {
        String s = "sid";
        arr = new ArrayList<>();
        printSubSet(0,s,"");
        System.out.println(arr);
    }
}
