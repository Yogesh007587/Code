package com.company;

class player{
    int id;
    int salary;
    String name;
    public void details(){
        System.out.print("Player id is: "+id);
        System.out.println(" and name is: " +name);
    }
    public  int getSalary(){
        return salary;
    }

}
public class custom_class {
    public static void main(String[] args) {
        player kakarot = new player();
        player john = new player();
        kakarot.id = 23;
        kakarot.name = "Player 1";
        kakarot.salary = 34;
        john.id =45;
        john.name = "Player 2";
        john.salary = 45;
        //System.out.println(kakarot.id);
        //System.out.println(kakarot.name);
        kakarot.details();
        john.details();
        int salary=kakarot.getSalary();
        int salary1= john.getSalary();
        System.out.println("The salary of kakarot is: " +salary);
        System.out.print("The salary of john is: " +salary1);


    }
}
