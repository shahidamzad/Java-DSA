package DSASeries.Stack;


public class ArrayInStack {

    private int[] arr;
    private int top;
    private int capacity;

    // Constructor
    ArrayInStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Push element
    public void push(int value) {

        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = value;

        System.out.println(value + " pushed");
    }

    // Pop element
    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = arr[top];
        top--;

        return value;
    }

    // Peek top element
    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    // Return size
    public int size() {
        return top + 1;
    }

    // Display stack
    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    // Main method
    public static void main(String[] args) {

        ArrayInStack st = new ArrayInStack(5);

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.display();

        System.out.println("Top element: " + st.peek());

        System.out.println("Popped: " + st.pop());

        System.out.println("Top element: " + st.peek());

        System.out.println("Size: " + st.size());

        System.out.println("Is Empty: " + st.isEmpty());

        System.out.println("Is Full: " + st.isFull());

        st.push(50);
        st.push(60);
        st.push(70);
    }
}
