package assignment2;

public class Array2 {

	public static void main(String[] args) {
		//There are 5 semesters and each semesters had 6 subjects with marks and results
		
		String [][][] data= new String[5][6][2];
		//semester 1
		data[0][0][0]= "mathematics1 ";
		data[0][1][0]= "physics";
		data[0] [2][0]= "chemistry";
		data[0][3][0] = "computer programming";
	    data[0] [4] [0]= "engineering drawing";
	    data[0][5][0]= "basic electrical engineering";
	    //result
	    data [0][0][1]= "pass (78)";
	    data [0][1][1]= "pass 85";
	    data [0][2][1]= "fail 21";
	    data [0][3][1]= "pass 74";
	    data [0][4][1] ="pass 88";
	    data [0][5][1] = "pass 79";
	    
	   //semester 2
	    //subject
	    data[1][0][0]= "mathematics 2 ";
	    data [1][1][0]= "mechanics";
	    data [1][2][0]= "environmental science";
	    data [1][3][0]= "basic electronics";
	    data [1][4][0]= "engineering physics";
	    data [1][5][0]= "engineering graphics";
	    //result
	    data[1][0][1]="Pass(82)";
	    data[1][1][1]="Pass(77)";	
	    data[1][2][1]="Pass(93)";
	    data[1][3][1]="Fail(19)";
	    data[1][4][1]="Fail(24)";
	    data[1][5][1]="Pass(90)";
	    
	    //semester 3
	    //subject
	    data[2][0][0]= "Data Structures ";
	    data [2][1][0]= "DiscreteMathematics";
	    data [2][2][0]= "DigitalElectronics";
	    data [2][3][0]= "Operating Systems";
	    data [2][4][0]= "Signals and Systems";
	    data [2][5][0]= "Object-Oriented Prog";
	    //result
	    data[2][0][1]="Pass(88)";
	    data[2][1][1]="Pass(81)";	
	    data[2][2][1]="Pass(76)";
	    data[2][3][1]="Fail(32)";
	    data[2][4][1]="Pass(85)";
	    data[2][5][1]="Pass(78)";
	    //semester 4
	    //subject
	    data[3][0][0]= "Algorithms ";
	    data [3][1][0]= "Computernetworks";
	    data [3][2][0]= "DatabaseSystems";
	    data [3][3][0]= "Microprocessors";
	    data [3][4][0]= "Communication Eng.";
	    data [3][5][0]= "Communication Eng.";
	    
	    //result
	   data[3][0][1]="Pass(91)";
	    data[3][1][1]="Pass(73)";	
	    data[3][2][1]="Fail(19)";
	    data[3][3][1]="Pass(80)";
	    data[3][4][1]="Pass(76)";
	    data[3][5][1]="Pass(87)";
	    //semester 5
	    //subject
	    data[4][0][0]= "Probability & Stats ";
	    data [4][1][0]= "Machine Learning";
	    data [4][2][0]= "Compiler Design";
	    data [4][3][0]= "Theory of Computation";
	    data [4][4][0]= "Embedded Systems";
	    data [4][5][0]= "Computer Graphics";
	    //result
	    data[4][0][1]="Pass(86)";
	    data[4][1][1]="Pass(88)";	
	    data[4][2][1]="Pass(84)";
	    data[4][3][1]="Pass(95)";
	    data[4][4][1]="Pass(73)";
	    data[4][5][1]="Pass(90)";
	    //print sem 3 , subject 4 & 5 names
	    System.out.println("semester 3, subject 4: + operating system");// operating system
	    System.out.println("semester 3, subject 5: +signal and system");
	    // print result of semester 4 subject 3 and 6
	    System.out.println("result of semester 4, subject 3:+Fail(19)");
	    		System.out.println("result of semester4, subject 6:+Pass(87) ");
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
