package com.Task4;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by pshirmovski on 5/31/2016.
 */
public class Complement {

    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>();
        Set<Integer> b = new TreeSet<>();
        Set<Integer> c = new TreeSet<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        b.add(3);
        b.add(4);
        b.add(5);

        c.addAll(a);
        c.removeAll(b);

        System.out.println(c);

    }
}
