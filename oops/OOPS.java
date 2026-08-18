class OOPS{

    public static void main(String arg[]){
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        // p1.setColor("yellow");
        p1.setColor( "Red");
         System.out.println(p1.getColor());


        
    }
}



class Pen{
   private String color;
   private  int tip ;

    void setColor(String newColor){
        color = newColor;
    }

    String getColor(){
        return this.color;
    }

    void setTip(int newTip){
        tip = newTip;
    }

    int getTip(){
        return this.tip;
    }
}