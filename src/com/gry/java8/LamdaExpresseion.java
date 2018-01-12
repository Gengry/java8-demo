package com.gry.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
* Lamda表达式
* */
public class LamdaExpresseion {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names,(a,b) -> a.compareTo(b));
        Collections.sort(names, (String a, String b) -> b.compareTo(a));
        Collections.sort(names, (String a, String b) -> { return b.compareTo(a); });
        System.out.println(names);
    }

}
