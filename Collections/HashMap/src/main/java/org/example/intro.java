package org.example;
import java.util.*;
import java.util.Map; // Import Map for Map.Entry
import java.util.Map.Entry;
public class intro {
    public static void main(String[] args) {
        HashMap<String , Integer> map=new HashMap<>();
        map.put("a",6);
        map.put("b",9);
        map.put("c",3);

        System.out.println(map );
        System.out.println("size = "+map.size());

        if(map.containsKey("a")){
            int a =map.get("a");
            System.out.println(a);
        }

        for(String key : map.keySet()){
            System.out.println(key +"="+ map.get(key));
        }

        for(Entry<String , Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
