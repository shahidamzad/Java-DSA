package DSASeries.Stack;

import java.util.Stack;

public class ReverseStack {


    static void main(String[] args) {


        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);

        Stack<Integer> st2 = new Stack<>();

        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        System.out.println(st2);
    }
}
