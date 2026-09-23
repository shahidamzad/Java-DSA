package DSASeries.Queue;

public class QueueArray {

        int[] arr;
        int front;
        int rear;
        int size;

        QueueArray(int capacity) {
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        // Add element
        void enqueue(int value) {

            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }

            rear++;
            arr[rear] = value;
            size++;

            System.out.println(value + " added");
        }

        // Remove element
        int dequeue() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int value = arr[front];
            front++;
            size--;

            return value;
        }

        // Get front element
        int peek() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }

        boolean isEmpty() {
            return size == 0;
        }

        boolean isFull() {
            return size == arr.length;
        }

        public static void main(String[] args) {

            QueueArray q = new QueueArray(5);

            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);

            System.out.println("Front: " + q.peek());

            System.out.println("Removed: " + q.dequeue());
            System.out.println("Removed: " + q.dequeue());

            System.out.println("Front: " + q.peek());
        }
}
