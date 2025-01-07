package assignment;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
	
	List<String> grocerylist = new ArrayList<String>();
	
	public void addItem(String item) {
	
		grocerylist.add(item);
		System.out.println(item + " added to the list.");
	}
	
	public void removeItem(String item) {
		
		grocerylist.remove(item);
	    System.out.println(item + " removed from the list");
	}
	
	public void viewList() {
		
		System.out.println("Grocery List:");
        for (String item : grocerylist) {
            System.out.println("- " + item);
        }
        
	}
}
