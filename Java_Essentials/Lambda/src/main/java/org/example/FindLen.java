package org.example;
import java.util.function.Function;

public class FindLen {
    public static void main(String[] args) {
        Function<String , Integer> s=(n)->n.length();

        int res=s.apply("Java Essentials");
        System.out.println("length="+res);
    }
}
