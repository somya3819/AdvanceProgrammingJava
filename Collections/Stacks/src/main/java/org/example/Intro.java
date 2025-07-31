package org.example;
import java.util.*;
public class Intro {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        st.push("India");
        st.push("Germany");
        st.push("japan");

        System.out.println(st);

        st.peek();
        System.out.println(st.peek());

        st.pop();
        System.out.println(st);
    }
}
