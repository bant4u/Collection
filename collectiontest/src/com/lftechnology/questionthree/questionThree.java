package com.lftechnology.questionthree;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/*
 *   Write a program that uses Shuffle algorithm to 
 *   print the words in its argument list in random order. 
 *   Hint: Use List and Collection
 * 	Author: BIJAY
 */

public class questionThree {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (String a : args)
            list.add(a);
        Collections.shuffle(list, new Random());
        System.out.println(list);
    }
}
