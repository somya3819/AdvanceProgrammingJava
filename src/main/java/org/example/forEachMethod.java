package org.example;

import java.util.ArrayList;

public class forEachMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(8);
        arr.add(9);
        arr.forEach((n)->{
            System.out.println(n);
        });
    }
}
