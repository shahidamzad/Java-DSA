package DSASeries.Linked_list;

public class shallowCopyOfNode {
    static void main(String[] args) {
        Node a = new Node(100);
        System.out.println(a.val);
        Node temp = a; // Shallow Copy of A
        System.out.println(temp.val);
    }
}
