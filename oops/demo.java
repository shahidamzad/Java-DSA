package oops;

// class in java
class demo {
    int a = 10;
    String b = " shahid";
    void show() {
        System.out.println(a+" "+b);
    }
}

class  result{
    static void main(String[] args) {
        demo d = new demo(); // // constructor in java
        d.show();
    }
}