package com.lftechnology.questionsixth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
/*
 * Create an array list with 49 Integer objects containing the numbers 1 through 49. 
 * It then randomly shuffles the list and selects the first 6 values from the shuffled list.
 *  Finally, it sorts the selected values and prints them out. 
 * Hint: Use ArrayList, Collections.shuffle(), ArrayList.subList(), and Collection.sort().
 */
public class QuestionSixth {
	public static void main(String[] args){
	int i=1;
	ArrayList<Integer> list=new ArrayList<Integer>();
	Iterator iterator;
	//Adding data value
	System.out.println("Added values to list:: ");
	for(i=1;i<50;i++)
	{
		list.add(i);
	}
	System.out.println(list);
	//Suffling
	Collections.shuffle(list, new Random());
	
	List<Integer> sub = list.subList(1, 6); 
	System.out.println(sub);
	Collections.sort(sub);
	System.out.println(sub);
	
}}
