package org.example;
import java.util.*;

//in hash-set ,hamesha in any type of SET elements will be unique
//it also accepts null elements

public class Intro {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("S");
        set.add("o");
        set.add("m");
        set.add("y");

        System.out.println(set);

        System.out.println("set contains C or not ? "+ set.contains("C"));

        set.remove("y");
        System.out.println(set);

        for(String i:set){
            System.out.println(i);
        }
    }
}
