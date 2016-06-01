package com.Task3;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by pshirmovski on 5/31/2016.
 */
public class InterSection {

    public static void main(String[] args) {
        Set<Integer> one = new TreeSet<>();
        Set<Integer> two = new TreeSet<>();
        Set<Integer> three = new TreeSet<>();

        one.add(1);
        one.add(2);
        one.add(4);

        two.add(3);
        two.add(4);
        two.add(5);
        two.add(2);

        three.addAll(one);
        three.retainAll(two);

        System.out.println(three);


    }
}
