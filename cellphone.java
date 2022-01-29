package com.company;

class cellphone{
    public void ringing(){
        System.out.print("Ringing...");
    }
    public void vibrating(){
        System.out.print("Vibrating...");
    }
}
public class ps2 {
    public static void main(String[] args) {
        cellphone nokia = new cellphone();
        nokia.ringing();
        nokia.vibrating();
    }
}
