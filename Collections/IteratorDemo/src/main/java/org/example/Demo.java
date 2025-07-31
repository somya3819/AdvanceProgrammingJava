package org.example;
import java.sql.Array;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for(int i:list){
            System.out.println(i);
        }

        Iterator<Integer> it= list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        List<Integer> nums=new ArrayList<>();
        for(int i =1 ; i<6 ;i++){
            nums.add(i);
        }
        System.out.println(nums);

//        for(int num:nums){    //it will show error , ab yaha pr iterator use karenge as it provided the benefits of remving the element
//            if(num%2==0){
//                nums.remove(num);
//            }
//        }
//        System.out.println(nums);

        Iterator<Integer> a= nums.iterator();
        while(a.hasNext()){
            int num=a.next();
            if(num%2==0){
                a.remove();
            }
        }
        System.out.println(nums);

        ListIterator<Integer> li=nums.listIterator();
    }
}
