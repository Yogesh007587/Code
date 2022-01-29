package com.company;

class Square{
    int side;

    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class ps3 {
    public static void main(String[] args) {
        Square a = new Square();
        a.side = 10;
        System.out.print("The area of square a is: " );
        System.out.println(a.area());
        System.out.print("The perimeter of square a is: " );
        System.out.println(a.perimeter());
    }
}
