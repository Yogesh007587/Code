package com.company;

import java.awt.*;
import java.util.Locale;

public class van {
    public static void main(String[] args) {
        String name = new String("KOOKY");
        System.out.println(name );

        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String upstring = name.toUpperCase();
        System.out.println(upstring);

        String name1 = " KAKAROT ";
        String trim = name1.trim();
        System.out.println(trim);

        String v = name.substring(1);
        System.out.println(v);
        System.out.println(name.substring(0,3));

        System.out.println(name.replace('O','A'));
        System.out.println(name.replace("OKY" , "IER"));

        System.out.println(name.startsWith("KO"));
        System.out.println(name.endsWith("Ki"));
        System.out.println(2);

        System.out.println(name.indexOf("K"));
        System.out.println(name.indexOf("K" , 2));

        System.out.println(name.lastIndexOf("K"));
        System.out.println(name.lastIndexOf("K" , 1));

        System.out.println(name.equals("KOOY"));
        System.out.println(name.equalsIgnoreCase("KooKY"));

        System.out.println("I'm a good gamer \nknown as \"KOOKY\"");
        System.out.println("I'm a good gamer known as \t \"KOOKY\"");
        System.out.println("I'm a good gamer \\known as \"KOOKY\"");
    }
}
