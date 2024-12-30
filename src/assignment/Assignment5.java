package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5 {
	
	public static void main(String[] args) {
		
		//Create a list of the top 5 most populated countries in the world and print 2nd Country
		
		List<String> countries = new ArrayList<String>();
		countries.add("United State");
		countries.add("India");
		countries.add("China");
		countries.add("Russia");
		countries.add("Japan");
		
		//System.out.println("Second Country is: " +countries);
		System.out.println("Second Country is: " +countries.get(1) +"\n\n");
		
		
		//Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		
		Set<String> touristPlace = new HashSet<String>();
		touristPlace.add("Agra");
		touristPlace.add("Goa");
		touristPlace.add("Sweezerland");
		touristPlace.add("London");
		touristPlace.add("Singapore");
		touristPlace.add("Itly");
		touristPlace.add("Paris");
		touristPlace.add("Bankok");
		touristPlace.add("New York");
		touristPlace.add("Tokyo");
		
		//System.out.println("Size of Set is: " +touristPlace);
		System.out.println("Size of Set is: " +touristPlace.size() +"\n\n");
		
		//Create a map of the 5 largest cities in the United States and their populations.
		
		Map<String, Integer> cities = new HashMap<String, Integer>();
		cities.put("New York", 8335897);
		cities.put("Houston", 2635897);
		cities.put("Chicago", 2335897);
		cities.put("Los Angeles", 3835897);
		cities.put("Phoenix", 1335897);
		
		System.out.println("The 5 largest cities in the United States and their populations : ");
		System.out.println("New York population is - "+cities.get("New York"));
		System.out.println("Houston population is - "+cities.get("Houston"));
		System.out.println("Chicago population is - "+cities.get("Chicago"));
		System.out.println("Los Angeles population is - "+cities.get("Los Angeles"));
		System.out.println("Phoenix population is - "+cities.get("Phoenix")+ "\n\n");
		
		
		//Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		
		int [] numbers = new int [10];
		numbers[0]=1;
		numbers[1]=2;
		numbers[2]=3;
		numbers[3]=1;
		numbers[4]=17;
		numbers[5]=7;
		numbers[6]=1;
		numbers[7]=1;
		numbers[8]=5;
		numbers[9]=6;
		
		//To calculate Sum 
		
		int sum = numbers[2]+numbers[4];
		System.out.println("Sum of 3rd and 5th Value is - "+sum+ " \n\n");
		
		
		//Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
	
		List<String> movies = new ArrayList<String>();
		movies.add("Dangal");
		movies.add("Baahubali 2: The Conclusion");
		movies.add("RRR");
		movies.add("Pathaan");
		movies.add("KGF Chapter 2");
		
		// Print the third movie
		System.out.println("The third highest-grossing movie is: " + movies.get(2));
		    
		
	}
}
