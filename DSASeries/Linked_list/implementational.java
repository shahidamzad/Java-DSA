package DSASeries.Linked_list;

class SLL{
    Node head;
    Node tail;
    int size;

    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();
    }
}
public class implementational {
    static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.Display();
        System.out.println(list.size);


        list.insertAtEnd(5);
        list.Display();

        System.out.println(list.size);
    }
}
