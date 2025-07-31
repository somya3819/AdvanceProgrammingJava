package org.example;
import java.util.*;
public class intro {
    public static void main(String[] args) {
        Queue<String> q=new PriorityQueue<>();

        q.add("India");
        q.add("Germany");
        q.add("America");

        System.out.println(q);

        q.remove();
        System.out.println(q);//removes head

        System.out.println(q.peek());//shows the head

        System.out.println(q.poll());//removes the head and shows what has been removed
        System.out.println(q);


    }
}
