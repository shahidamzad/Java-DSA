package DSASeries.Stack;

import java.util.Stack;




public class IntoductionOfStack {

    public static void print(Stack<Integer> st) {
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);


        while(!st.isEmpty()) {
            st.pop();
        }

        System.out.println(st);

       //  print();

    }
}