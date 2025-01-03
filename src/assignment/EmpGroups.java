package assignment;

public class EmpGroups { 
    
	public static void main(String[] args) {
		
		//Retrieve the data from the Employees class
		
		Employees emp = new Employees();
		
		// Arrays to store employee names and IDs

	    String[] empNames = new String [3];
	    int[] empIDs = new int [3];
	    
	    empNames[0]= emp.name1;
	    empNames[1]= emp.name2;
	    empNames[2]= emp.name3;
	    
	    empIDs[0]= emp.id1;
	    empIDs[1]= emp.id2;
	    empIDs[2]= emp.id3;
	    
	    
	    
	    // print statements for each employee's name along with their corresponding ID.
	    
	    System.out.println("Employee Name: " + empNames[0] + ", Employee ID: " + empIDs[0]);
        System.out.println("Employee Name: " + empNames[1] + ", Employee ID: " + empIDs[1]);
        System.out.println("Employee Name: " + empNames[2] + ", Employee ID: " + empIDs[2]);
	    
	}

}
