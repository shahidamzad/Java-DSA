package DSASeries.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    static Queue<Integer> que;

    static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
    }
    static void print(Queue<Integer> q) {


        System.out.println(q);
    }
    static void main(String[] args) {

        que = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);
        que.add(70);
        que.add(80);
        print(que);
        System.out.println(" reversing the queue");
        reverseQueue(que);
        print(que);


    }
}
