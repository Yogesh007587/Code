package com.company;

class sphere{
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
        return 4*3.14*radius*radius;
    }
    public double surfacearea(){
        return 4/3*Math.PI*radius*radius*radius;
    }
}
public class psc{
    public static void main(String[] args) {
        sphere c = new sphere();
        c.setRadius(5);
        c.setHeight(10);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());
        System.out.println(c.volume());
        System.out.println(c.surfacearea());

    }
}
