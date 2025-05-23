package assignment5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5 {

	public static void main(String[] args) {
		
		//Student1 Details//
		
		Map<String, String> Student1Map= new HashMap<String, String>();
		
		Student1Map.put("Name","John Doe");
		Student1Map.put("Age", "20");
		Student1Map.put("Gender", "Male");
		Student1Map.put("Roll Number", "S12345");
		Student1Map.put("Grade", "A");
		Student1Map.put("Major", "Computer Science");
		Student1Map.put("GPA", "3.8");
		Student1Map.put("Email", "john@example.com");
		Student1Map.put("Contact Number", "9876543210");
		Student1Map.put("Address", "123 Elm St");
		System.out.println("Student 1 details :" + Student1Map);
		
		//Student2 Details//
		
		Map<String, String> Student2Map= new HashMap<String, String>();
		
		Student2Map.put("Name","Jane Smith");
		Student2Map.put("Age", "21");
		Student2Map.put("Gender", "Female");
		Student2Map.put("Roll Number", "S12346");
		Student2Map.put("Grade", "B");
		Student2Map.put("Major", "Mathematics");
		Student2Map.put("GPA", "3.5");
		Student2Map.put("Email", "jane@example.com");
		Student2Map.put("Contact Number", "9876543211");
		Student2Map.put("Address", "456 oak st");
		System.out.println("Student 2 Details:" + Student2Map);
		
		Map<String, String> Student3Map= new HashMap<String, String>();
		
		Student3Map.put("Name","Mike Brown");
		Student3Map.put("Age", "22");
		Student3Map.put("Gender", "Male");
		Student2Map.put("Roll Number", "S12347");
		Student2Map.put("Grade", "A");
		Student2Map.put("Major", "Physics");
		Student2Map.put("GPA", "3.9");
		Student2Map.put("Email", "mike@example.com");
		Student2Map.put("Contact Number", "9876543212");
		Student2Map.put("Address", "789 pine st");
		System.out.println("Student3 Details:" + Student3Map);
		
		//student1 student2 student3 lists are added in student list//
		
		List<Map<String, String>> studentList = new ArrayList<Map<String, String>>();
		
		studentList.add(Student1Map);
		studentList.add(Student1Map);
		studentList.add(Student3Map);
		
		System.out.println("Student List :" + studentList);
		
		//employee1 details stored//
		
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
		
		System.out.println("Employee 1 details :" + Employee1Map);
		
		//employee2 details stored//
		
		Map<String, String> Employee2Map= new HashMap<String,String>();
		
		Employee2Map.put("Employee id", "E002");
		Employee2Map.put("Name", "Bob Johnson");
		Employee2Map.put("Age", "35");
		Employee2Map.put("Gender", "Male");
		Employee2Map.put("Department", "Marketing");
		Employee2Map.put("Position", "Marketing Manager");
		Employee2Map.put("Salary", "85,000");
		Employee2Map.put("Email", "bob@example.com");
		Employee2Map.put("Contact Number", "9876543214");
		
		System.out.println("Employee 2 details:"+Employee2Map);
		
		Map<String, String> Employee3Map= new HashMap<String,String>();
		

		
		Employee3Map.put("Employee id", "E003");
		Employee3Map.put("Name", "Caraol White");
		Employee3Map.put("Age", "28");
		Employee3Map.put("Gender", "Female");
		Employee3Map.put("Department", "Sales");
		Employee3Map.put("Position", "Sales Executive");
		Employee3Map.put("Salary", "65,000");
		Employee3Map.put("Email", "carol@example.com");
		Employee3Map.put("Contact Number", "9876543215");
		
		System.out.println("Employee 3 details:"+Employee3Map);
		
		//employee1, employee2 and employee3 details added in list//
		

		List<Map<String, String>> employeeList = new ArrayList<Map<String, String>>();
		employeeList.add(Employee1Map);
		employeeList.add(Employee2Map);
		employeeList.add(Employee3Map);
		System.out.println("Employee list :" + employeeList);
		
		//product1 details//
		
		Map<String, String> Product1Map = new HashMap<String, String>();

		

		Product1Map.put("Product ID", "P001");
		Product1Map.put("Name", "Laptop");
		Product1Map.put("Category", "Electronics");
		Product1Map.put("Price", "$1,200");
		Product1Map.put("Stock Quantity", "50");
		Product1Map.put("Supplier", "Tech Supplies");
		Product1Map.put("Warranty", "2 years");
		Product1Map.put("Rating", "4.5");
		Product1Map.put("Manufacturing Date", "15-01-2023");
		Product1Map.put("Expiry Date", "15-01-2025");

		System.out.println("Product 1 details :" + Product1Map);
		
		//Product2 details//
		

        Map<String, String> Product2Map = new HashMap<String, String>();
        
        Product2Map.put("Product id", "P002");
		Product2Map.put("Name", "Desk Chair");
		Product2Map.put("Category", "Furniture");
		Product2Map.put("Price", "$150");
		Product2Map.put("Stock Quantity", "100");
		Product2Map.put("Supplier", "Office Depot");
		Product2Map.put("Warranty", "1 years");
		Product2Map.put("Rating", "4");
		Product2Map.put("Manufacturing Date", "02-10-2023");
		Product2Map.put("Expiry Date", "N/A");

		System.out.println("Product 2 details :" + Product2Map);
		
		//product3 details//
		
		Map<String, String> Product3Map = new HashMap<String, String>();
		
		Product3Map.put("Product id", "P003");
		Product3Map.put("Name", "Coffee Maker");
		Product3Map.put("Category", "Kitchen");
		Product3Map.put("Price", "$75");
		Product3Map.put("Stock Quantity", "200");
		Product3Map.put("Supplier", "Kitchen Wolrd");
		Product3Map.put("Warranty", "6 months");
		Product3Map.put("Rating", "4.2");
		Product3Map.put("Manufacturing Date", "20-03-2023");
		Product3Map.put("Expiry Date", "20-03-2024");

		System.out.println("Product 3 details :" + Product3Map);
		
		//product1, product2 and product3 are stored in list//
		
		List<Map<String, String>> productList = new ArrayList<Map<String, String>>();
		
		productList.add(Product1Map);
		productList.add(Product2Map);
		productList.add(Product3Map);
                
		System.out.println("productList:" +productList);
		
		
		Map<String, List<Map<String, String>>> data = new HashMap<String, List<Map<String, String>>>();
		data.put("Studentdata",studentList);
		data.put("employeedata", employeeList);
		data.put("productdata", productList);
		
		System.out.println("All data list:"+ data);
		System.out.println("***********************************************************");
		
		System.out.println("Supplier Name of 2nd row of productdata: "+ data.get("productdata").get(1).get("Supplier"));

		

  
        
    

		
		
		
		
		
		

		
		
		
		
		
		
		

	}

}
