package com.company;

class Rockstar_games{
    public void hit(){
        System.out.println("Tommy is Hitting....");
    }
    public void run(){
        System.out.println("Tommy is running...");
    }
    public void fire(){
        System.out.println("Tommy is firing");
    }
}
public class ps4 {
    public static void main(String[] args) {
        Rockstar_games Tommy_vercetti = new Rockstar_games();
        Tommy_vercetti.fire();
        Tommy_vercetti.hit();
        Tommy_vercetti.run();


    }
}
