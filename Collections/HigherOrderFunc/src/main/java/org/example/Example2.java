package org.example;
import com.sun.security.jgss.GSSUtil;

import java.util.function.Function;
public class Example2 {
    public static Function<Integer , Integer> createMultiplier(int multiplier){
        return (number)->number*multiplier;
    }
    public static void main(String[] args) {
        Function<Integer , Integer> doubler=createMultiplier(2);

        Function<Integer,Integer> tripler =createMultiplier(3);

        int res1=doubler.apply(10);
        int res2=tripler.apply(8);
        System.out.println(res1);
        System.out.println(res2);;

    }
}
