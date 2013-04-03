package com.lftechnology.questionfour;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/*
 * Write a program 
 * that prints its arguments in random order.
 *  Do not make a copy of the argument array.
 * 
 * 
 * 
 * */

public class QuestionFour {
	public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        Collections.shuffle(list,new Random());
        System.out.println(list);
    }


}
