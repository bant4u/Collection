package com.lftechnology.questionfive;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class QuestionFive {
	public static void main(String[] args) throws ConcurrentModificationException, IndexOutOfBoundsException
	{
		LinkedList<String> one=new LinkedList<String>();
		LinkedList<String> two=new LinkedList<String>();
	//	LinkedList<String> three=new LinkedList<String>();
		
		Iterator iterator;
		one.add("one");
		one.add("two");
		one.add("three");
		one.add("four");
		one.add("five");
		two.add("six");
		two.add("seven");
		two.add("eight");
		two.add("nine");
		two.add("ten");
	
		iterator=one.iterator();
		System.out.println("Element Added on Arraylist ONE :: ");
		for(String a:one){
			System.out.println(a);
		}
		System.out.println("Element Added on Arraylist TWO :: ");
		for(String b:two){
			System.out.println(b);
		}
		
		//merging two on one
		one.addAll(two);
		System.out.print("After merging the LIST one is ::"+one);
	
	//	ListIterator ltr=two.listIterator();
	
		//	while(ltr.hasNext()){
			//	two.remove(1);
			//	System.out.println(ltr.next());
		//	}
		for(String a:two)
		{
			two.remove(1);
			
			System.out.println(a);	
		}
		
	// here exception is thrown.. dont know why...		
		
		System.out.print("After removing the every second value on two is ::");
		for (String a: two)
		{
		System.out.println(a); 	
		}
		
		
	}

}
