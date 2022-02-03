package com.company;

class base{
    private int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("it is the worth of being god.!");
        this.x = x;
    }
}
class base2 extends base{
    private int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
public class kooky1 {
    public static void main(String[] args) {
        base2 d = new base2();
        d.setX(5);
        System.out.println(d.getX());
        base b = new base();
        b.setX(5);
        System.out.println(b.getX());
        base2 b2 =new base2();
        b2.setY(10);
        System.out.println(b2.getY());

    }
}
