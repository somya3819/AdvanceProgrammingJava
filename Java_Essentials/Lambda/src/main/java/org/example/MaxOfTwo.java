package org.example;
import java.util.*;
@FunctionalInterface
interface MaxTwo{
    int findMax(int a , int b);
}
public class MaxOfTwo {
    public static void main(String[] args) {
        MaxTwo mt=(a,b)->Math.max(a,b);

        int res=mt.findMax(9,23);
        System.out.println(res);
    }
}
