package com.lftechnology.questionfirst;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author bijay
 */
class WordCounting {
    List<String> words=new ArrayList<String>();
    Set<String> unique=new HashSet<String>();
    
    public void addWords(String word)
    {
    
        words.add(word);
    }
    
    public void duplicate()
    {
    System.out.println("Duplicate wORD=");
        Iterator i=words.iterator();
    
    for(String s: words)
    {
   if(!unique.contains(s)){
       unique.add(s);
   }
   else
   {
   System.out.println(s);
   }
   
    }
    
    }
    public void unique()
    {
    System.out.println("Uniques are :"+unique.size());
    Iterator hi=unique.iterator();
    while(hi.hasNext())
    {
    Object uniqueval=hi.next();
    System.out.println(uniqueval);
    }
       
    }
}