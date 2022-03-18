
import java.util.*;
//import java.io.*;

public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Arraylist of integers

			ArrayList<Integer> scores = new ArrayList<Integer>();

		System.out.println(scores.size());

				scores.add(2); // Autoboxing //Adding Integer 2 into the array list
		
				scores.add(5);
		
				scores.add(3);
		
				scores.add(0, 56); // Insert element 56

		System.out.println(scores.size());

		// An example of how arrays are different from arrayList

		int[] scoresArray = new int[5];

		System.out.println(scoresArray.length); // this will print 5 since size is fixed

		// scores.remove(2); //remove element from that index
		// scores.remove(Object); //remove that object from the arrayList

		System.out.println(scores.size());

		// For-each loop
		// for (TypeThatArrayListHolds variableName : arryListName)

		for (Integer a : scores) { // runs 0 through length-1

			System.out.println(a);

		}
		// for(Start; condition; update)
		// do-while, while, for range, for-each each element in array or arrayList

		for (int i = 0; i <= scores.size() - 1; i++) {

			System.out.println(scores.get(i));
		}

		System.out.println(scores.isEmpty()); // false

			ArrayList<String> students = new ArrayList<String>();
	
				students.add("Connor");
		
				students.add("Sushil");
		
				students.add("Jon");
		
				students.add("Tomas");

		System.out.println(students.size()); // 4

		System.out.println(students.isEmpty());// false

				students.set(2, "Justin");

		System.out.println(students);

	}

}
