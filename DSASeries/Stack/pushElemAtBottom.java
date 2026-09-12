package DSASeries.Stack;

import java.util.Stack;

public class pushElemAtBottom {
    static void main(String[] args) {
        Stack<Integer> original= new Stack<>();
        original.push(1);
        original.push(2);
        original.push(3);
        original.push(4);
        original.push(5);
        System.out.println(original);


        int new_elem = 50;

        Stack<Integer> temp = new Stack<>();

        // reverse elem
        while(original.size()>0){
            temp.push(original.pop());
        }
        System.out.println(temp);

        // add new elem at bottom
        original.push(new_elem);

        // reverse all elem of temp
        while(!temp.isEmpty()){
            original.push(temp.pop());
        }

        System.out.println(original);
    }
}
