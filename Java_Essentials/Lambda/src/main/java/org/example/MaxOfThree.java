package org.example;
import java.util.*;

@FunctionalInterface
interface MaxThree{
    int findMax(int a, int b ,int c);
}
public class MaxOfThree {
    public static void main(String[] args) {
        MaxThree s=(a,b,c)-> Math.max(a , Math.max(b,c));

        int res=s.findMax(45,67,23);
        System.out.println(res);
    }
}
