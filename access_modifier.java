package com.company;

class zebra{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id =i;
    }
    public int getId(){
        return id;
    }

}
public class access_modifier {
    public static void main(String[] args) {
        zebra kooky = new zebra();
        kooky.setName("Kakarot");
        kooky.setId(04);
        System.out.println(kooky.getId());
        System.out.print(kooky.getName());
    }
}
