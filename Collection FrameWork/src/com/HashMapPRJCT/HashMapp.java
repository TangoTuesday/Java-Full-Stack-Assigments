package com.HashMapPRJCT;

import java.util.*; 

public class HashMapp {

	
	public void iterateUsingEntrySet(Map <String, Integer> map) {

		for(Map.Entry<String, Integer> entry : map.entrySet()) {

			System.out.println(entry.getKey() + ":" + entry.getValue());

		
		}
	}
	
	
	public static void main(String[] args) {
		
	
	
	HashMap <String, Double> weatherInformation = new HashMap <String, Double> (); 
	
	weatherInformation.put("wind", 55.0);
	weatherInformation.put("minTemperature", 20.5);
	weatherInformation.put("maxTemperature", 50.8);
	weatherInformation.put("humidity", 50.0);
	weatherInformation.put("airPressure", 12.0);
		
	
	 iterateUsingEntrySet(Map <String, Integer> map) {

			for(Map.Entry<String, Integer> entry : map.entrySet()) {

				System.out.println(entry.getKey() + ":" + entry.getValue());

			
			}
		}
		
	
}

}