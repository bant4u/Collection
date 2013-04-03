package com.lftechnology.questionfirst;


/**
 *
 * @author bijay
 */
public class Question {
    public static void main(String[] args){
        WordCounting word=new WordCounting();
    
        for(String s:args){
         word.addWords(s);
        }
        word.duplicate();
        word.unique();
    
    
    }
}