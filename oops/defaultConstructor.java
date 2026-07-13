package oops;

class  A{
    int a ; String  b; boolean c;
//   A(){
//        a= 1 ; b="raja" ; c=true;
//
//    }
    void  nap(){
        System.out.println(a+" "+b +" "+c);
    }
}

class  B{
    static void main(String[] args) {
        A r = new A();
        r.nap();
    }

}