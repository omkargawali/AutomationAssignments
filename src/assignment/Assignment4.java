package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4 {

	public static void main(String[] args) {

		/* Student Details Stored */

		// Student1 details stored using HashMap

		Map<String, String> Student1Map = new HashMap<String, String>();
		Student1Map.put("Name", "John Doe");
		Student1Map.put("Age", "20");
		Student1Map.put("Gender", "Male");
		Student1Map.put("Roll Number", "S12345");
		Student1Map.put("Grade", "A");
		Student1Map.put("Major", "Computer Science");
		Student1Map.put("GPA", "3.8");
		Student1Map.put("Email", "john@example.com");
		Student1Map.put("Contact Number", "9999997777");
		Student1Map.put("Address", "123 Elm St");

		// Student2 details stored using HashMap

		Map<String, String> Student2Map = new HashMap<String, String>();
		Student2Map.put("Name", "John Smith");
		Student2Map.put("Age", "21");
		Student2Map.put("Gender", "Female");
		Student2Map.put("Roll Number", "S12346");
		Student2Map.put("Grade", "B");
		Student2Map.put("Major", "Mathematics");
		Student2Map.put("GPA", "3.5");
		Student2Map.put("Email", "jane@example.com");
		Student2Map.put("Contact Number", "9876665666");
		Student2Map.put("Address", "456 Oak St");

		// Student3 details stored using HashMap

		Map<String, String> Student3Map = new HashMap<String, String>();
		Student3Map.put("Name", "John Smith");
		Student3Map.put("Age", "21");
		Student3Map.put("Gender", "Female");
		Student3Map.put("Roll Number", "S12346");
		Student3Map.put("Grade", "B");
		Student3Map.put("Major", "Mathematics");
		Student3Map.put("GPA", "3.5");
		Student3Map.put("Email", "jane@example.com");
		Student3Map.put("Contact Number", "9876665666");
		Student3Map.put("Address", "456 Oak St");

		/* Employee Details Stored */

		// Employee1 details stored using HashMap

		Map<String, String> Employee1Map = new HashMap<String, String>();
		Employee1Map.put("Employee ID", "E001");
		Employee1Map.put("Name", "Alice Green");
		Employee1Map.put("Age", "30");
		Employee1Map.put("Gender", "Female");
		Employee1Map.put("Department", "Engineering");
		Employee1Map.put("Position", "Software Engineer");
		Employee1Map.put("Salary", "75,000");
		Employee1Map.put("Email", "alice@example.com");
		Employee1Map.put("Contact Number", "9876543213");

		// Employee2 details stored using HashMap

		Map<String, String> Employee2Map = new HashMap<String, String>();
		Employee2Map.put("Employee ID", "E002");
		Employee2Map.put("Name", "Bob Johnson");
		Employee2Map.put("Age", "35");
		Employee2Map.put("Gender", "Male");
		Employee2Map.put("Department", "Marketing");
		Employee2Map.put("Position", "Marketing Manager");
		Employee2Map.put("Salary", "85,000");
		Employee2Map.put("Email", "bob@example.com");
		Employee2Map.put("Contact Number", "9876543214");

		// Employee2 details stored using HashMap

		Map<String, String> Employee3Map = new HashMap<String, String>();
		Employee3Map.put("Employee ID", "E003");
		Employee3Map.put("Name", "Carol White");
		Employee3Map.put("Age", "28");
		Employee3Map.put("Gender", "Female");
		Employee3Map.put("Department", "Sales");
		Employee3Map.put("Position", "Sales Executive");
		Employee3Map.put("Salary", "65,000");
		Employee3Map.put("Email", "carol@example.com");
		Employee3Map.put("Contact Number", "9876543215");

		/* Products Details Stored */

		// Product1 details stored using HashMap

		Map<String, String> Product1Map = new HashMap<String, String>();
		Product1Map.put("Product ID", "P001");
		Product1Map.put("Name", "Laptop");
		Product1Map.put("Category", "Electronics");
		Product1Map.put("Price", "$1,200");
		Product1Map.put("Stock Quantity", "50");
		Product1Map.put("Supplier", "Tech Supplies");
		Product1Map.put("Warrant", "2 years");
		Product1Map.put("Rating", "4.5");
		Product1Map.put("Manufacturin Date", "15-01-2023");
		Product1Map.put("Expiry Date", "15-01-2025");

		// Product2 details stored using HashMap

		Map<String, String> Product2Map = new HashMap<String, String>();
		Product2Map.put("Product ID", "P002");
		Product2Map.put("Name", "Desk Chair");
		Product2Map.put("Category", "Furniture");
		Product2Map.put("Price", "$150");
		Product2Map.put("Stock Quantity", "200");
		Product2Map.put("Supplier", "Office Depot");
		Product2Map.put("Warrant", "1 years");
		Product2Map.put("Rating", "4");
		Product2Map.put("Manufacturin Date", "10-02-2023");
		Product2Map.put("Expiry Date", "N/A");

		// Product3 details stored using HashMap

		Map<String, String> Product3Map = new HashMap<String, String>();
		Product3Map.put("Product ID", "P003");
		Product3Map.put("Name", "Coffee Maker");
		Product3Map.put("Category", "Kitchen");
		Product3Map.put("Price", "$75");
		Product3Map.put("Stock Quantity", "100");
		Product3Map.put("Supplier", "KitchenWorld");
		Product3Map.put("Warrant", "6 months");
		Product3Map.put("Rating", "4.2");
		Product3Map.put("Manufacturin Date", "20-03-2023");
		Product3Map.put("Expiry Date", "20-03-2024");
		
		// Creating Student List and Printing student list
		
		List<Map<String,String >> studentList = new ArrayList<Map<String,String >>();
		studentList.add(Student1Map);
		studentList.add(Student1Map);
		studentList.add(Student3Map);
		System.out.println("Student List :"+studentList);
		
		// Creating Product List and Printing product list
		
		List<Map<String, String>> productList = new ArrayList<Map<String,String>>();
		productList.add(Product1Map);
		productList.add(Product2Map);
		productList.add(Product3Map);
		System.out.println("Product List :"+productList);
		
		// Creating Employee List and Printing employee list
		
		List<Map<String, String>> employeeList = new ArrayList<Map<String,String>>();
		employeeList.add(Employee1Map);
		employeeList.add(Employee2Map);
		employeeList.add(Employee3Map);
		System.out.println("Employee List :"+employeeList);
		
		// all data of studentList,employeeList,productList are mapped under Map(HashMap)

		Map<String, List<Map<String, String>>> data = new HashMap<String, List<Map<String, String>>>();
		data.put("StudentDetails", studentList);
		data.put("EmployeeDetails", employeeList);
		data.put("ProductDetails", productList);
		System.out.println("All Data List :" + data);
		System.out.println("Displaying Supplier Name of second row ProductData: " +data.get("ProductDetails").get(1).get("Supplier"));


	}

}
