package com.company;

class player{
    int id;
    String name;
    public void details(){
        System.out.print("Player id is: "+id);
        System.out.println(" and name is: " +name);
    }
}
public class custom_class {
    public static void main(String[] args) {
        player kakarot = new player();
        player john = new player();
        kakarot.id = 23;
        kakarot.name = "Player 1";
        john.id =45;
        john.name = "Player 2";
        //System.out.println(kakarot.id);
        //System.out.println(kakarot.name);
        kakarot.details();
        john.details();

    }
}
