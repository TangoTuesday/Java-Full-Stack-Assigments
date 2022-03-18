package com.map.keyset;

import java.util.*;
import java.io.*;

public class Mappps {
	

		//using entrySet();
		public void iterateUsingEntrySet(Map <String, Integer> map) {

			for(Map.Entry<String, Integer> entry : map.entrySet()) {

				System.out.println(entry.getKey() + ":" + entry.getValue());

			
			}
		}
		//Using KeySet();
		public void iterateUsingKeySetAndForeach(Map <String, Integer> map) {
			
			for(String key : map.keySet()) {
				
				System.out.println(key + ":" + map.get(key));
				
			}
			
		}
		//Iterating Over Values Using values();
		public void iterateValues(Map <String, Integer> map) {
			
			for(Integer value : map.values()) {
				
				System.out.println(value);
				
			}
			
		}
		
		//Iterator and entrySet(); 
		public void iterateUsingIteratorAndEntry(Map <String, Integer> map) {
			
			Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
			
			while(iterator.hasNext()) {
				
				Map.Entry<String, Integer> entry = iterator.next(); 
				
				System.out.println(entry.getKey() +  ":" + entry.getValue());
			}
			
		}
		
		//Iterator and keySet();
		public void iterateUsingIteratorAndKeySet(Map<String, Integer> map) {
			
			Iterator<String> iterator = map.keySet().iterator();
			
			while (iterator.hasNext()) {
				
				String key = iterator.next();
				
				System.out.println(key + ":" + map.get(key));
				
				
				
			}
			
		}
		
		//Iterator and values();
		public void iterateUsingIteratorAndValues(Map <String, Integer> map) {
			
			Iterator<Integer> iterator = map.values().iterator(); 
			
			while(iterator.hasNext()) {
				
				Integer value = iterator.next();
				
				System.out.println("value" + ":" + value);
				
			}
			
		}
		
		//Using forEach() and Lambda
		public void iterateUsingLambda(Map <String, Integer> map) {
			
			map.forEach((k, v) -> System.out.println((k + ":" + v)));
			map.keySet().forEach(k -> System.out.println((k + ":" + map.get(k))));
		}
		
		//Using Stream API 
		public void iterateUsingStreamAPI(Map <String, Integer> map) {
			
			map.entrySet().stream()
			//.... some other Stream processings
			.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
			
		}
		
		
}

		



