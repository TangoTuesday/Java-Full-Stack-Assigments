package com.collectionsMore;

import java.util.HashMap;

public class Mapps {

	public static void main(String[] args) {

		HashMap<String, String> capitalCities = new HashMap<String, String>();

		capitalCities.put("Santa Fe", "Two Million Degrees");

		capitalCities.put("Austin", "Lame!!");

			System.out.println(capitalCities);

		capitalCities.put("Austin", "Lame!!");

			System.out.println(capitalCities);
			
				System.out.println(capitalCities.get("Austin"));
			
		capitalCities.remove("Santa Fe"); 
			
			System.out.println(capitalCities);
			
			
	}

}
