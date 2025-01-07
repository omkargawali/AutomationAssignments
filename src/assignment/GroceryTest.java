package assignment;

public class GroceryTest {

	public static void main(String[] args) {

		GroceryList groceryList = new GroceryList();

		// Add items to the grocery list
		groceryList.addItem("Apples");
		groceryList.addItem("Bread");
		groceryList.addItem("Milk");

		// View the list
		groceryList.viewList();

		// Remove an item from the list
		groceryList.removeItem("Bread");

		// View the list again
		groceryList.viewList();

	}

}
