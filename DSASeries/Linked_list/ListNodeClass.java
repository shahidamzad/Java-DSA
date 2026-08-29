package DSASeries.Linked_list;

class  Node{
   int val;
   Node next;

   Node(int val){
       this.val = val;
   }
}
public class ListNodeClass {
    static void main(String[] args) {
    Node a = new Node(10);
    Node b = new Node(20);
    Node c = new Node(39);
    Node d = new Node(49);
    Node e = new Node(50);

        a.next = b; //  linking  =  a -> b  || 10 ->20
        b.next = c; //  linking  =  b -> c  || 10->20->30
        c.next = d; //  linking  =  c -> d  || 10->20->30->40
        d.next = e; //  linking  =  d -> e  || 10->20->30->40->50

        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);


    }
}
