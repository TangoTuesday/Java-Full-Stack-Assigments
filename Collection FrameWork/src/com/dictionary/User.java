package com.dictionary;

import java.util.*;

public class User {
	
	public static void main(String[] args) {
		
		Dictionary myDictionary = new Dictionary (); 
		
		//I want to add a new work to my dictionary
		myDictionary.dictionary.put("Java", "Coffee and Programming go hand in hand"); 
		
		//I want to display all the elements in my dictionary, one at a time
		
		for(Map.entry<String, String> eachWordMeaningMapping : myDictionary.dictionary.entrySet()) 
			
			System.out.println("The word is " + eachWordMeaningMapping.getKey() + ":" + "The meaning ");
		
	}
	
	//Remove carrot from my dictionary
	myDictionary.dictionary.remove("carrot"); 
	
	//Give me all the words that are in my dictionary
	HashSet<String> allWords = (HashSet<String>) myDictionary.dictionary.keySet();

}
