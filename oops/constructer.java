package oops;

 class constructer {
    int a ; String name;

     constructer(){
        a = 0 ; name = null;
     }
     void show(){
         System.out.println(a+" " + name);
     }
}

class  showConstructer{
     static void main(String[] args) {
        constructer c = new constructer();
        c.show();
    }
}