package org.example;
import java.util.*;
import java.util.stream.Collectors;

public class PrintEle {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Somya","Mahajan","krinsya"));
        names.forEach(name-> System.out.print(name+" "));

        names.forEach(name-> System.out.print(name.toUpperCase()+" "));//toLowerCase
        Collections.sort(names,(n1,n2)->n1.compareTo(n2));
        System.out.println("after sorting="+names);


        System.out.println();
        List<Integer> numbers = Arrays.asList(9, 52, 27, 43, 85, 74);
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> oddNumbers=numbers.stream().filter(s->s%2!=0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }
}
