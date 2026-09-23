package DSASeries.Trees;

public class sumOfTreeNodes {
    static void main(String[] args) {
        Node a = new Node(1);
        Node b  = new Node(2);
        Node c  = new Node(3);
        Node d  = new Node(4);
        Node e  = new Node(5);
        Node f  = new Node(6);
        Node g  = new Node(7);
        Node h  = new Node(8);
        Node i  = new Node(9);
        Node j  = new Node(10);

        a.left=b; a.right = c;
        b.left=d; b.right = e;
        d.left=f; d.right = g;
        c.left=i; c.right = j;
        e.left=h;



        display(a);
        System.out.println();
       // System.out.println(sum(a));
        System.out.println(product(a));
    }

    private static int sum(Node root) {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);

    }

    private static long product(Node root) {
        if (root == null) return 1;
        return root.val * product(root.left) * root.val * product(root.right);
    }

    private static void display(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);

    }
}
