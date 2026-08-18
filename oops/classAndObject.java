package oops;

public class classAndObject {
    static void main(String[] args) {
        Pen p1 = new Pen(); // create a new Pen  object call p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

    }
}

class Pen{
    String color;
    int tip;




    public void setColor(String  newColor) {
        color = newColor;
    }

    public void setTip(int newTip) {
        tip = newTip;
    }
}