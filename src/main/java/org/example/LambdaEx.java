package org.example;
//Lambda with multiple parameters
interface TwoPointers{
    void display(int a , int b);
}
public class LambdaEx {
    public static void main(String[] args) {
        TwoPointers tp=(a,b)->{
            System.out.println("sum is "+ a+b);
        };
        tp.display(2,3);
    }
}