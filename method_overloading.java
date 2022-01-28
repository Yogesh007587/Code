package com.company;

public class method_overloading {
    static void qwe(){
        System.out.println("Good morning bro.!");
    }
    static void qwe(int a){
        System.out.println("Good morning "+ a +" bro.!  ");
    }
    public static void main(String[] args) {
        qwe();
        qwe(2000);
    }
}
