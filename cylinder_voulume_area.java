package com.company;

class cylinder{
    private int radius ;
    private int height ;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }
    public double surfacearea(){
        return 2*3.14*radius*height + 2*3.14*radius*radius;
    }
}
public class psa {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.setRadius(5);
        c.setHeight(10);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());
        System.out.println(c.volume());
        System.out.println(c.surfacearea());

    }
}
