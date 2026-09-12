package DSASeries.Stack;

import java.util.Stack;

public class DisplayRecursively {
    public static void diplayRev(Stack<Integer> original){
        if(original.isEmpty()) return;

        int top = original.pop();

       // System.out.println(top);

        diplayRev(original);

       // System.out.println(top);

        original.push(top);




    }
    static void main(String[] args) {
        Stack<Integer> original= new Stack<>();
        original.push(1);
        original.push(2);
        original.push(3);
        original.push(4);
        original.push(5);

        diplayRev(original);

    }
}
