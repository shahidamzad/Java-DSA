package DSASeries.Recursion;

public class FunctionCall {
 static  void banana(){
     System.out.println("Banana");
 }
     static void call(){
        System.out.println("Function Call");;
        function();
    }
     static void function(){
        System.out.println("Function Call");
        banana();
    }
    static void mango(){
        System.out.println("mango");
        call();
    }
    static void main(String[] args) {
        System.out.println("Hello World");
        mango();
    }
}
