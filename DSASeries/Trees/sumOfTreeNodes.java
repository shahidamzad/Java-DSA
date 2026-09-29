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
        System.out.println(sum(a));
       System.out.println(product(a));
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(size(a));
        System.out.println(level(a));
    }


    // sum of all root number
    private static int sum(Node root) {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);

    }

    // max number of root
    private static int max(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        int a= root.val;
        int b= max(root.left);
        int c= max(root.right);
        return Math.max(a, Math.max(b, c)) ;

    }

    // minimum number of root
    private static int min(Node root){
        if (root == null) return Integer.MAX_VALUE;
        int a= root.val;
        int b= min(root.left);
        int c= min(root.right);
        return Math.min(a, Math.min(b, c)) ;
    }

    // product of all root
    private static long product(Node root) {
        if (root == null) return 1;
        return root.val * product(root.left) * root.val * product(root.right);
    }

    // print all tree roots

    private static void display(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);

    }

    // find the size of bs tree
    private static int size(Node root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    // level / height of binary tree
    private static int level(Node root) {
        if (root == null) return 0;
        return 1+ Math.max(level(root.left), level(root.right));
    }
}
