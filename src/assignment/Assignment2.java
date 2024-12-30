package assignment;

public class Assignment2 {
	
	public static void main(String[] args) {
		
		// 3D array with all categories 
		
		/* 
		 * first dimension represents the main categories 
		 * second dimension represents the subcategories 
		 * third dimension stores the products
		 */
		
		
		String [] [] [] product = new String [2] [4] [5] ;
		
		
		/* Groceries */ 
		
		product[0][0][0] = "Cola";
		product[0][0][1] = "Orange Juice";
		product[0][0][2] = "Lemonade";
		product[0][0][3] = "Green Tea";
		product[0][0][4] = "Black Coffee";
		
		
		product[0][1][0] = "Popcorn";
		product[0][1][1] = "Trail Mix";
		product[0][1][2] = "Beef Jerky";
		product[0][1][3] = "Salted Nuts";
		product[0][1][4] = "Rice Cakes";
		
		
		product[0][2][0] = "Cottage Cheese";
		product[0][2][1] = "Heavy Cream";
		product[0][2][2] = "Ice Cream";
		product[0][2][3] = "Parmesan Cheese";
		product[0][2][4] = "Eggnog";
		
		
		product[0][3][0] = "Apples";
		product[0][3][1] = "Bananas";
		product[0][3][2] = "Carrots";
		product[0][3][3] = "Potatoes";
		product[0][3][4] = "Onions";
		
		
		/* Electronics */ 
		
		product[1][0][0] = "Cola";
		product[1][0][1] = "Orange Juice";
		product[1][0][2] = "Lemonade";
		product[1][0][3] = "Green Tea";
		product[1][0][4] = "Black Coffee";
		
		
		product[1][1][0] = "Popcorn";
		product[1][1][1] = "Trail Mix";
		product[1][1][2] = "Beef Jerky";
		product[1][1][3] = "Salted Nuts";
		product[1][1][4] = "Rice Cakes";
		
		
		product[1][2][0] = "Cottage Cheese";
		product[1][2][1] = "Heavy Cream";
		product[1][2][2] = "Ice Cream";
		product[1][2][3] = "Parmesan Cheese";
		product[1][2][4] = "Eggnog";
		
		
		product[1][3][0] = "Apples";
		product[1][3][1] = "Bananas";
		product[1][3][2] = "Carrots";
		product[1][3][3] = "Potatoes";
		product[1][3][4] = "Onions";
		

		
		// cola from Groceries
		System.out.println("Groceries - Beverages: " + product[0][0][0]); 
		
		// Onions from Groceries
        System.out.println("Groceries - Produce: " + product[0][3][4]); 
        
        // Beef Jerky from Electronics
        System.out.println("Electronics - Snacks: " + product[1][1][2]); 
		
	}
}
