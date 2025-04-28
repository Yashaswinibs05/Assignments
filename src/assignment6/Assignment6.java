package assignment6;

import java.util.Hashtable;

public class Assignment6 {

	


	public static void main(String[] args) {
		
		String[] StudentNames= new String[3];
		StudentNames[0]= "Suresh";
		StudentNames[1]= "Mahesh";
		StudentNames[2]= "Naresh";
		//Student Marks//
		
		int[] StudentMarks = new int[3];
		StudentMarks[0]= 75;
		StudentMarks[1]= 80;
		StudentMarks[2]= 82;
		
		 System.out.println(StudentMarks [0]+=10);
		 System.out.println(StudentMarks [1]+=10);
		 System.out.println(StudentMarks [2]+=10);
		 //Marks added//
		 
		Hashtable<String,Integer> value= new Hashtable<String,Integer>();
		
		 value.put(StudentNames[0],StudentMarks[0]);
		 value.put(StudentNames[1],StudentMarks[1]);
		 value.put(StudentNames[2],StudentMarks[2]);
		 
		 System.out.println("Updated marks:"+ value);
		 System.out.println("Average marks:"+((StudentMarks[0]+StudentMarks[1]+StudentMarks[2])/3));
		 
		 
		 
		 
		









	
	
	
	
		
		
	
		
			

	}

}
