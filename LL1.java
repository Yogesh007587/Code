package com.company;
import java.util.*;
public class LL1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("is");
        list.add("a");
        list.addLast("list");
        list.addFirst("this");
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(3);
        list.removeLast();
        list.removeFirst();

        System.out.println(list);
    }
}
