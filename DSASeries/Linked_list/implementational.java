package DSASeries.Linked_list;

class SLL{
     Node head;
     Node tail;
    int size;

    void insertAtTail(int val){
    Node temp = new Node(val);
    if (head == null){
        head = tail = temp;
    }
    else{
    tail.next = temp;
    tail = temp;
    }
    size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insert(int idx ,int val){
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size){
            insertAtTail(val);
            return;
        }
        if (idx > size || idx < 0) {
            System.out.println("Invalid Index!!");
            return;
        }
        Node temp = new Node(val);
        Node x = head;

        for(int i = 1; i <= idx-1 ; i++){
            x= x.next;
        }
        // insertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    int get(int idx) throws Error{
        if(idx == size) return tail.val;
        if(idx < 0 || idx > size){
            throw new Error("Invalid Index!!");
        }
        Node temp = head;
        for(int i = 1; i <= idx ; i++){
            temp= temp.next;

        }
        return temp.val;
    }

    void set(int idx, int val) throws Error{
        if(idx == size)  {
            tail.val = val;

        }
        if(idx < 0 || idx > size){
            throw new Error("Invalid Index!!");
        }
        Node temp = head;
        for(int i = 1; i <= idx ; i++){
            temp= temp.next;

        }
         temp.val = val;
    }

    void deleteAtHead() throws Error{
        if(head == null) throw new Error("Invalid Index!!");
            head =  head.next;
            size--;

    }

    void delete(int idx) throws Error{
        if(idx == 0){
            deleteAtHead();
            return;
        }
        if(head == null) throw new Error("List is Empty!!");

        if(idx < 0 || idx >= size){
            throw new Error("Invalid Index!!");

        }
        Node temp = head;
        for(int i = 1; i <= idx -1 ; i++){
          temp= temp.next;
        }
        if (temp.next == tail) tail = temp;
        temp.next = temp.next.next;
    size--;
    }


void display(){
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
//        list.insertAtHead(10);
//        list.insertAtHead(20);
//        list.insertAtHead(30);
//        list.insertAtHead(40);
//        list.Display();
//        System.out.println(list.size);
//
//
//        list.insertAtHead(5);
//        list.Display();
//
//        System.out.println(list.size);

       list.insertAtTail(10);
       list.insertAtTail(20);
       list.insertAtTail(30);
       list.insertAtTail(40);
       list.insertAtTail(50);
       list.insertAtTail(60);

        list.display();

        System.out.println();
        list.insertAtHead(69);
        list.display();

        list.insert(2,400);
        list.insert(39,500);
        list.display();
        System.out.println(list.get(3));
      //  System.out.println(list.get(40));

        list.display();
        list.set(3,3);
        list.display();

        list.deleteAtHead();
        list.display();
        list.delete(5);
        list.display();

        System.out.println(list.tail.val);
        list.display();
        list.delete(5);
        list.display();

        System.out.println(list.tail.val);

    }
}
