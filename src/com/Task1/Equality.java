package com.Task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by pshirmovski on 5/31/2016.
 */
public class Equality {

    public static void main(String[] args) {

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        //Adding values into arrayLists

        listA.add(0,1);
        listA.add(1,2);
        listA.add(2,3);
        listA.add(3,4);

        listB.add(0,3);
        listB.add(1,1);
        listB.add(2,4);
        listB.add(3,2);


        //Removing all the equal elements from the arrays
        if(listA.containsAll(listB)) {
            System.out.println("Множества равны");
        }
        else {
            System.out.println("Множества не равны");
        }



    }
}
