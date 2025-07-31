package org.example;
import java.util.function.BiFunction;
public class HigherOrderExam {
    public static int operate(int a , int b, BiFunction<Integer , Integer ,Integer> operation){
        return operation.apply(a,b);
    }
    public static void main(String[] args) {
        BiFunction<Integer , Integer , Integer> add=(x,y)->x+y;
        BiFunction<Integer,Integer,Integer> multiply=(x,y)->x*y;

        int sum=operate(10 , 5 , add);
        System.out.println("Sum="+sum);

        int prod=operate(10,9,multiply);
        System.out.println("prod="+prod);
    }
}
