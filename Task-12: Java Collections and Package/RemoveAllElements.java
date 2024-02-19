package task12_programs;

import java.util.ArrayList;

	public class RemoveAllElements {
	    public static void main(String[] args) {
	        // Create an ArrayList of strings
	        ArrayList<String> arrayList = new ArrayList<>();

	        // Add some elements to the ArrayList
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");
	        arrayList.add("Mango");

	        // Print the ArrayList before removing elements
	        System.out.println("ArrayList before removing elements: " + arrayList);

	        // Remove all elements from the ArrayList
	        arrayList.clear();

	        // Print the ArrayList after removing elements
	        System.out.println("ArrayList after removing elements: " + arrayList);
	    }
	}


