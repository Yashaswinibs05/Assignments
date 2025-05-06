package assignment9;

import java.util.HashMap;
import java.util.Map;

public class Assignment9 {

	public static void main(String[] args) {
		// storing employee names//
		
		String[] employeeNames= new String[5];
		
		employeeNames[0] = "Alice Johnson";
		employeeNames[1] = "Bob Smith";
		employeeNames[2] = "Carol Davis";
		employeeNames[3] = "David Brown";
		employeeNames[4] = "Eva Green";
		
		//employee data//
		
		double[] employee1data = {75000.0, 5.0, 4.2};
		double[] employee2data = {68000.0, 3.0, 3.8};
		double[] employee3data = {82000.0, 7.0, 4.5};
		double[] employee4data = {90000.0, 10.0, 2.2};
		double[] employee5data = {60000.0, 2.0, 3.5};
		
		//store data of employee//
		
		Map<String, double[]> employeedata = new HashMap<>();
		
		employeedata.put(employeeNames[0], employee1data);
		employeedata.put(employeeNames[1], employee2data);
		employeedata.put(employeeNames[2], employee3data);
		employeedata.put(employeeNames[3], employee4data);
		employeedata.put(employeeNames[4], employee5data);
		
		Map<String, Double> hikeMap= new HashMap<>();
		
		for (String employees: employeeNames) {
			double[] data = employeedata.get(employees);
			double basicsalary = data[0];
			double exp = data[1];
			double ratings= data[2];
			double varpayPercentage=0;
			int bonus =0;
			double reward= 0;
			
			if(ratings>=4)
			{
				varpayPercentage=15;
				bonus=1500;
			} else if(ratings>3 || ratings<=4) { 
				varpayPercentage=10;
				bonus= 1200;
			}else {
				varpayPercentage=3;
				bonus=300;
			}
			//for employees more than 5 years experience//
			if (exp >=5) {
				reward=5000;
			}
			double hike = (basicsalary*varpayPercentage/100)+bonus+ reward;
			
			Double hikePer= (hike/basicsalary)*100;
			hikeMap.put(employees,hikePer);
		}
		System.out.println("hike of employees:"+ hikeMap);
	}
}
			
				
			
				
			
			

		
		
		

	


