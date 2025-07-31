package org.example;
///automatically sorted at the key position
import java.util.TreeMap;

public class Intro {
    public static void main(String[] args) {
        TreeMap<Integer,String> n=new TreeMap();

        n.put(3,"A");
        n.put(2,"B");
        n.put(1,"C");

        System.out.println(n);

        //iteration
        for(int i: n.keySet()){
            System.out.println(i+"="+n.get(i));
        }
    }
}
