package org.example;
import java.util.*;
public class Intro {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("o");
        list.add("m");
        list.add("y");

        System.out.println(list);

        //addLast and addFirst
        list.addFirst("S");
        list.addLast("A");

        System.out.println(list);

        list.add(2,"m");//adding m at index 2
        System.out.println(list);

        list.remove(2);
        list.remove("y");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
