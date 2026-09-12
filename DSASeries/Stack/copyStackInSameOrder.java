package DSASeries.Stack;

import java.util.Stack;

public class copyStackInSameOrder {
    static void main(String[] args) {
        Stack<Integer> original = new Stack<>();

        original.push(1);
        original.push(2);
        original.push(3);
        original.push(4);

        System.out.println(original);
        System.out.println();

        Stack<Integer> temp= new Stack<>();
        while(!original.isEmpty()){
            temp.push(original.pop());
        }
        System.out.println(temp);
        System.out.println();

        Stack<Integer> copy_orignal = new Stack<>();

        while (!temp.isEmpty()){
            copy_orignal.push(temp.pop());
        }

        System.out.println(copy_orignal);
    }
}
