package com.company;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return  name;
    }
    public void setName(String n){
        name = n;
    }
}
public class ps1 {
    public static void main(String[] args) {
        Employee kooky = new Employee();
        kooky.salary=90;
        kooky.setName("KING");
        System.out.println(kooky.getName());
        System.out.print(kooky.getSalary());
    }
}

