package com.Task2;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by pshirmovski on 5/31/2016.
 */
public class Union {
    public static void main(String[] args) {

        Set<Integer> firstSet = new TreeSet<>();
        Set<Integer> secondSet = new TreeSet<>();
        Set<Integer> thirdSet = new TreeSet<>();

        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(4);

        secondSet.add(3);
        secondSet.add(4);
        secondSet.add(5);
        secondSet.add(6);

        thirdSet.addAll(firstSet);
        thirdSet.addAll(secondSet);

        System.out.println(thirdSet);
    }

}


