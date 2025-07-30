package org.example;
import java.util.*;
public class Intro {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();//LHS= INTERFACE RHS=CONCRETE IMPLEMENTATION

        for(int i=1 ;i<=5 ;i++){
            l.add(i);
        }

        System.out.println(l);

        l.remove(3);

        System.out.println(l);//indexed based hai so it will not remove 3 , instead the element at index 3 i.e. 4

        for(int i=0 ; i<l.size();i++){
            System.out.print(l.get(i)+" ");//to get the element at ith index
        }

    }
}
