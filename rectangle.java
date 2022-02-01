package com.company;

class rectangle{
    private int length;
    private int breadth;
    public rectangle(){
        this.length = 4;
        this.breadth = 5;
    }
    public rectangle(int length , int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getLength(){return length;}
    public int getBreadth(){return breadth;}
}
public class psb {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
    }
}
