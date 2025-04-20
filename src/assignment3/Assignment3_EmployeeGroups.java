package assignment3;

public class Assignment3_EmployeeGroups {

	public static void main(String[] args) {
		//String [] Employeenames = new string []("Bharath","ABC","XYZ");
				//int [] Employeeid = new int [] (1234,1235,1236)
		//Need to retrieve data from Employees
	 Assignment3_Employees obj = new  Assignment3_Employees();
	String[]EmpNames= new String[3];
	EmpNames[0]=obj.EmpName1;
	EmpNames[1]=obj.EmpName2;
	EmpNames[2]=obj.EmpName3;
	
	int[]Empid= new int[3];
	Empid[0]= obj.Empid1;
	Empid[1]=obj.Empid2;
	Empid[2]=obj.Empid3;
	
	
	System.out.println("Name of the employee:"+obj.EmpName1);
	System.out.println("Empid of the employee:"+obj.Empid1);

	System.out.println("Name of the employee:"+obj.EmpName2);
	System.out.println("Empid of the employee:"+obj.Empid2);
	
	System.out.println("Name of the employee:"+obj.EmpName3);
	System.out.println("Empid of the employee:"+obj.Empid3);
	
	
			
	
	
	
	
	 
	 

		
		 
	
	
		
		
		
		
		
		
		

	}

}
