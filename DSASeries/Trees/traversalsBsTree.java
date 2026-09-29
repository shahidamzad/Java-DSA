package DSASeries.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class traversalsBsTree {

   public static class Pair{
        Node node;
        int level;

         Pair(Node node ,int level){
            this.node = node;
            this.level = level;
        }
    }
    static int n;
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       Node a = new Node(1);
       Node b = new Node(2);
       Node c = new Node(3);
       Node d = new Node(4);
       Node e = new Node(5);
       Node f = new Node(6);
       Node g = new Node(7);


       a.left = b; a.right = c;
       b.left = d; b.right = e;
       c.left = f;   c.right = g;

        System.out.print(" pre order : ");
      preOrder(a);
       System.out.println();
        System.out.print(" in order : ");
       inOrder(a);
       System.out.println();
        System.out.print(" post order : ");
       postOrder(a);
        System.out.println();
        System.out.println(" level  order : ");
        levelOrder(a);
        System.out.println();
//        System.out.print("Enter n : ");
//        n = sc.nextInt();
//        NthLevel(a, 0);


    }
    // nth level
    private static void NthLevel(Node root, int level){
        if (root == null) return;
        if( level == n ) System.out.print(root.val + " ");
        NthLevel(root.left, level + 1);
        NthLevel(root.right, level + 1);
    }

    // level order or breath first search (BFS)
    private static  void levelOrder(Node root) {
        int prevlevel = 0;
        Queue<Pair> q= new LinkedList<>();
        if (root != null)  q.add(new Pair(root , 0));

        while(q.size() > 0){
            Pair front = q.remove();
            Node temp = front.node;
            int level = front.level;
            if(level > prevlevel){
                System.out.println();
                prevlevel++;
            }
            System.out.print(temp.val + " ");
            if (temp.left != null) q.add( new Pair(temp.left, level + 1));
            if (temp.right != null) q.add( new Pair(temp.right, level + 1));

        }
        System.out.println();
    }

    // pre order (DFS)
    private static void preOrder(Node root){
       if (root == null) return;
       System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    // in order
   private static void inOrder(Node root){
      if (root == null) return;

      inOrder(root.left);
      System.out.print(root.val + " ");
      inOrder(root.right);
   }
   // post order  
   private static void postOrder(Node root){
      if (root == null) return;

      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.val + " ");
   }


}
