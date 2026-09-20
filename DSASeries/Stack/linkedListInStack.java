package DSASeries.Stack;


public class linkedListInStack {
    // Node
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    // Stack
    class Stack {
        Node head = null;
        int size = 0;
        // Push
        void push(int val) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
            System.out.println(val + " pushed");
        }

        // Pop
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int value = head.val;
            head = head.next;
            size--;

            return value;
        }

        // Peek
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }

        // Is Empty
        boolean isEmpty() {
            return head == null;
        }

        // Size
        int size() {
            return size;
        }

        // Display
        void display() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        linkedListInStack obj = new linkedListInStack();

        Stack st = obj.new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("Stack:");
        st.display();

        System.out.println("Peek: " + st.peek());
        System.out.println("Pop: " + st.pop());
        System.out.println("Peek: " + st.peek());
        System.out.println("Size: " + st.size());
        System.out.println("Is Empty: " + st.isEmpty());
        st.display(); 
    }
}